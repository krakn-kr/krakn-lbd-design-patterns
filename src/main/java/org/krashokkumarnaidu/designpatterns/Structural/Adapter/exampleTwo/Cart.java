package org.krashokkumarnaidu.designpatterns.Structural.Adapter.exampleTwo;
//Step 4: Client Code (Cart)

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void showCart() {
        for (CartItem item : items) {
            System.out.println(item.getItemDetails());
        }
    }
}

// Usage
class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        RestaurantMenuItem restaurantItem = new RestaurantMenuItem();
        GroceryProduct groceryProduct = new GroceryProduct();

        cart.addItem(new RestaurantMenuItemAdapter(restaurantItem));
        cart.addItem(new GroceryProductAdapter(groceryProduct));

        cart.showCart();
        // Output:
        // Paneer Butter Masala from Restaurant
        // 1kg Tomatoes from Instamart
    }
}
