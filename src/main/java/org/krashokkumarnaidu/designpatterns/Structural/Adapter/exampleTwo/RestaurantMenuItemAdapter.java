package org.krashokkumarnaidu.designpatterns.Structural.Adapter.exampleTwo;

//Step 3: Create Adapters
// Adapter for RestaurantMenuItem
public class RestaurantMenuItemAdapter implements CartItem {
    private RestaurantMenuItem menuItem;

    public RestaurantMenuItemAdapter(RestaurantMenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public String getItemDetails() {
        return menuItem.getMenuItem();
    }
}
