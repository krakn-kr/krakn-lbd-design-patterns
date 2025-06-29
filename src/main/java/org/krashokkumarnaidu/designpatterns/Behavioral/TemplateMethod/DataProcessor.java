package org.krashokkumarnaidu.designpatterns.Behavioral.TemplateMethod;

// Abstract class defining the template method
public abstract class DataProcessor {

    // Template method - defines the algorithm skeleton
    public final void processData() {
        loadData();
        if (isValidData()) {
            parseData();
            processSpecificData();
            saveData();
        } else {
            System.out.println("Invalid data. Processing aborted.");
        }
        cleanup();
    }

    // Common implementation - same for all subclasses
    private void loadData() {
        System.out.println("Loading data from source...");
    }

    // Hook method - can be overridden but has default implementation
    protected boolean isValidData() {
        System.out.println("Performing basic data validation...");
        return true; // Default: assume data is valid
    }

    // Abstract methods - must be implemented by subclasses
    protected abstract void parseData();
    protected abstract void processSpecificData();

    // Common implementation
    private void saveData() {
        System.out.println("Saving processed data...");
    }

    // Hook method with default implementation
    protected void cleanup() {
        System.out.println("Performing basic cleanup...");
    }
}
