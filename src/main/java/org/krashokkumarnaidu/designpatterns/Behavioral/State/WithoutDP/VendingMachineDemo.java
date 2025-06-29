package org.krashokkumarnaidu.designpatterns.Behavioral.State.WithoutDP;

// Vending Machine without State Pattern - using conditional logic
class VendingMachine {
    // State constants
    public static final int NO_COIN = 0;
    public static final int HAS_COIN = 1;
    public static final int SOLD = 2;
    public static final int SOLD_OUT = 3;

    private int currentState;
    private int coinCount;
    private boolean hasProduct;

    public VendingMachine(int productCount) {
        this.hasProduct = productCount > 0;
        this.coinCount = 0;

        // Set initial state
        if (hasProduct) {
            currentState = NO_COIN;
        } else {
            currentState = SOLD_OUT;
        }
    }

    public void insertCoin() {
        System.out.println("Inserting coin...");

        // Complex conditional logic based on current state
        if (currentState == NO_COIN) {
            System.out.println("Coin accepted!");
            coinCount++;
            currentState = HAS_COIN;
            System.out.println("State changed to: Has Coin State");

        } else if (currentState == HAS_COIN) {
            System.out.println("Coin already inserted. Please select a product.");

        } else if (currentState == SOLD) {
            System.out.println("Please wait, dispensing product...");

        } else if (currentState == SOLD_OUT) {
            System.out.println("Machine is sold out. Coin returned.");
        }
    }

    public void selectProduct() {
        System.out.println("Selecting product...");

        // More complex conditional logic
        if (currentState == NO_COIN) {
            System.out.println("Please insert a coin first!");

        } else if (currentState == HAS_COIN) {
            System.out.println("Product selected!");
            currentState = SOLD;
            System.out.println("State changed to: Sold State");
            dispenseProduct(); // Automatically dispense

        } else if (currentState == SOLD) {
            System.out.println("Product already selected, dispensing...");

        } else if (currentState == SOLD_OUT) {
            System.out.println("Machine is sold out. No products available.");
        }
    }

    public void dispenseProduct() {
        // Even more conditional logic
        if (currentState == NO_COIN) {
            System.out.println("Please insert a coin and select a product first!");

        } else if (currentState == HAS_COIN) {
            System.out.println("Please select a product first!");

        } else if (currentState == SOLD) {
            // Actual dispensing logic
            if (hasProduct) {
                hasProduct = false;
                System.out.println("Product dispensed!");
                coinCount--;

                // Determine next state
                if (hasProduct) {
                    currentState = NO_COIN;
                    System.out.println("State changed to: No Coin State");
                } else {
                    System.out.println("Machine is now out of products!");
                    currentState = SOLD_OUT;
                    System.out.println("State changed to: Sold Out State");
                }
            }

        } else if (currentState == SOLD_OUT) {
            System.out.println("Machine is sold out. Cannot dispense product.");
        }
    }

    // Additional methods that also need state checking
    public boolean canInsertCoin() {
        return currentState == NO_COIN || currentState == HAS_COIN;
    }

    public boolean canSelectProduct() {
        return currentState == HAS_COIN;
    }

    public boolean canDispenseProduct() {
        return currentState == SOLD;
    }

    // Method to add new functionality - shows how complex it gets
    public void refund() {
        System.out.println("Requesting refund...");

        // Need to check state for refund logic too
        if (currentState == NO_COIN) {
            System.out.println("No coin to refund.");

        } else if (currentState == HAS_COIN) {
            System.out.println("Coin refunded!");
            coinCount--;
            currentState = NO_COIN;
            System.out.println("State changed to: No Coin State");

        } else if (currentState == SOLD) {
            System.out.println("Cannot refund during dispensing.");

        } else if (currentState == SOLD_OUT) {
            System.out.println("No coin to refund - machine is sold out.");
        }
    }

    // Utility methods
    public String getCurrentStateName() {
        switch (currentState) {
            case NO_COIN: return "No Coin State";
            case HAS_COIN: return "Has Coin State";
            case SOLD: return "Sold State";
            case SOLD_OUT: return "Sold Out State";
            default: return "Unknown State";
        }
    }

    public boolean hasCoin() { return coinCount > 0; }
    public boolean hasProduct() { return hasProduct; }
}
/*
https://claude.ai/chat/e9c92715-7aad-4646-82ba-d541b9523a64
 */
// Demo class
public class VendingMachineDemo {
    public static void main(String[] args) {
        System.out.println("=== Vending Machine Without State Pattern Demo ===\n");

        // Create vending machine with one product
        VendingMachine machine = new VendingMachine(1);
        System.out.println("Initial state: " + machine.getCurrentStateName() + "\n");

        // Scenario 1: Normal purchase
        System.out.println("--- Scenario 1: Normal Purchase ---");
        machine.selectProduct();  // Should fail - no coin
        machine.insertCoin();     // Insert coin
        machine.insertCoin();     // Try to insert again
        machine.selectProduct();  // Select product - should dispense
        System.out.println("Current state: " + machine.getCurrentStateName() + "\n");

        // Scenario 2: Try to buy when sold out
        System.out.println("--- Scenario 2: Sold Out ---");
        machine.insertCoin();     // Try to insert coin when sold out
        machine.selectProduct();  // Try to select product when sold out
        System.out.println("Final state: " + machine.getCurrentStateName() + "\n");

        // Scenario 3: Test refund functionality
        System.out.println("--- Scenario 3: Create new machine and test refund ---");
        VendingMachine machine2 = new VendingMachine(2);
        machine2.insertCoin();
        System.out.println("Before refund: " + machine2.getCurrentStateName());
        machine2.refund();
        System.out.println("After refund: " + machine2.getCurrentStateName());
    }
}