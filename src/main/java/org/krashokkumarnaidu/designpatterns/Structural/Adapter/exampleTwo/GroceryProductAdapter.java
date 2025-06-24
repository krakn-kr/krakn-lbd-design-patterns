package org.krashokkumarnaidu.designpatterns.Structural.Adapter.exampleTwo;

//Step 3: Create Adapters
// Adapter for GroceryProduct
public class GroceryProductAdapter implements CartItem {
    private GroceryProduct product;

    public GroceryProductAdapter(GroceryProduct product) {
        this.product = product;
    }

    @Override
    public String getItemDetails() {
        return product.getProduct();
    }
}
