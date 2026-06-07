package class_relationships._02_aggregation.shopping_cart_system;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public Product findByName(String name){
        return products.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public int getProductCount() {
        return products.size();
    }
}
