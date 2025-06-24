package org.krashokkumarnaidu.designpatterns.Structural.Adapter.exampleThree;

/*
https://www.perplexity.ai/search/adapter-design-pattern-with-an-_PBfWp1VSY.ozuhnQ4iPNw
 */
// Target interface
public interface RowingBoat {
    void row();
}

// Adaptee class
class FishingBoat {
    public void sail() {
        System.out.println("The fishing boat is sailing");
    }
}

// Adapter class
class FishingBoatAdapter implements RowingBoat {
    private final FishingBoat boat;

    public FishingBoatAdapter() {
        this.boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail(); // Delegates the call
    }
}

// Client class
class Captain {
    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}

// Usage
class Main {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row(); // Output: The fishing boat is sailing
    }
}
