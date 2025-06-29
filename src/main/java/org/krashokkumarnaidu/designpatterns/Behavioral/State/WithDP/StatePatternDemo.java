package org.krashokkumarnaidu.designpatterns.Behavioral.State.WithDP;

// State interface
interface VendingMachineState {
    void insertCoin(VendingMachine machine);
    void selectProduct(VendingMachine machine);
    void dispenseProduct(VendingMachine machine);
    String getStateName();
}

// Context class
class VendingMachine {
    private VendingMachineState currentState;
    private int coinCount;
    private boolean hasProduct;

    // State instances
    private VendingMachineState noCoinState;
    private VendingMachineState hasCoinState;
    private VendingMachineState soldState;
    private VendingMachineState soldOutState;

    public VendingMachine(int productCount) {
        // Initialize states
        noCoinState = new NoCoinState();
        hasCoinState = new HasCoinState();
        soldState = new SoldState();
        soldOutState = new SoldOutState();

        this.hasProduct = productCount > 0;
        this.coinCount = 0;

        // Set initial state
        if (hasProduct) {
            currentState = noCoinState;
        } else {
            currentState = soldOutState;
        }
    }

    // Delegate methods to current state
    public void insertCoin() {
        System.out.println("Inserting coin...");
        currentState.insertCoin(this);
    }

    public void selectProduct() {
        System.out.println("Selecting product...");
        currentState.selectProduct(this);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }

    // State management methods
    public void setState(VendingMachineState state) {
        this.currentState = state;
        System.out.println("State changed to: " + state.getStateName());
    }

    public String getCurrentState() {
        return currentState.getStateName();
    }

    // Getters for states
    public VendingMachineState getNoCoinState() { return noCoinState; }
    public VendingMachineState getHasCoinState() { return hasCoinState; }
    public VendingMachineState getSoldState() { return soldState; }
    public VendingMachineState getSoldOutState() { return soldOutState; }

    // Business logic methods
    public void addCoin() { coinCount++; }
    public void removeCoin() { if (coinCount > 0) coinCount--; }
    public boolean hasCoin() { return coinCount > 0; }
    public boolean hasProduct() { return hasProduct; }
    public void releaseProduct() {
        if (hasProduct) {
            hasProduct = false;
            System.out.println("Product dispensed!");
        }
    }
}

// Concrete State: No Coin State
class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin accepted!");
        machine.addCoin();
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Please insert a coin first!");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Please insert a coin and select a product first!");
    }

    @Override
    public String getStateName() {
        return "No Coin State";
    }
}

// Concrete State: Has Coin State
class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin already inserted. Please select a product.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Product selected!");
        machine.setState(machine.getSoldState());
        machine.dispenseProduct();
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Please select a product first!");
    }

    @Override
    public String getStateName() {
        return "Has Coin State";
    }
}

// Concrete State: Sold State
class SoldState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please wait, dispensing product...");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Product already selected, dispensing...");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        machine.releaseProduct();
        machine.removeCoin();

        if (machine.hasProduct()) {
            machine.setState(machine.getNoCoinState());
        } else {
            System.out.println("Machine is now out of products!");
            machine.setState(machine.getSoldOutState());
        }
    }

    @Override
    public String getStateName() {
        return "Sold State";
    }
}

// Concrete State: Sold Out State
class SoldOutState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Machine is sold out. Coin returned.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Machine is sold out. No products available.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Machine is sold out. Cannot dispense product.");
    }

    @Override
    public String getStateName() {
        return "Sold Out State";
    }
}

// Demo class
public class StatePatternDemo {
    public static void main(String[] args) {
        System.out.println("=== Vending Machine State Pattern Demo ===\n");

        // Create vending machine with one product
        VendingMachine machine = new VendingMachine(1);
        System.out.println("Initial state: " + machine.getCurrentState() + "\n");

        // Scenario 1: Normal purchase
        System.out.println("--- Scenario 1: Normal Purchase ---");
        machine.selectProduct();  // Should fail - no coin
        machine.insertCoin();     // Insert coin
        machine.insertCoin();     // Try to insert again
        machine.selectProduct();  // Select product - should dispense
        System.out.println("Current state: " + machine.getCurrentState() + "\n");

        // Scenario 2: Try to buy when sold out
        System.out.println("--- Scenario 2: Sold Out ---");
        machine.insertCoin();     // Try to insert coin when sold out
        machine.selectProduct();  // Try to select product when sold out
        System.out.println("Final state: " + machine.getCurrentState());
    }
}