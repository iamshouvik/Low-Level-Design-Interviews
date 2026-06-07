package class_relationships._02_aggregation.shopping_cart_system;

public class Customer {

    private String name;
    private Cart cart;

    public Customer(String name, Cart cart) {
        this.name = name;
        this.cart = cart;
    }

    public void checkout() {
        System.out.println("Cart items: " + cart.getItemCount());
        System.out.println("Cart total: " + cart.getTotal());
        cart.clearCart();
    }

    public String getName() {
        return name;
    }
    public Cart getCart() {
        return cart;
    }
}
