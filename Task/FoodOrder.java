class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
    }
}

public class SwiggyFoodOrder {
    public static void main(String[] args) {
        FoodOrder f = new FoodOrder("Biryani", 2);
        f.display();
    }
}