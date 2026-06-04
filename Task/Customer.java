class Customer {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class CustomerDemo {
    public static void main(String[] args) {
        Customer c = new Customer(101, "Bharath");
        c.display();
    }
}