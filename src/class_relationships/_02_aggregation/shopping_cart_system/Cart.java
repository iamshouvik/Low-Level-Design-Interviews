package class_relationships._02_aggregation.shopping_cart_system;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> items = new ArrayList<>();

    public List<Product> getItems() {
        return items;
    }

    public int getItemCount(){
        return items.size();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void clearCart() {
        items.clear();
    }

    public double getTotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

}
