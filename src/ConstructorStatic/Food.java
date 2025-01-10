package ConstructorStatic;

public class Food {


    String name;
   double price;
    int quantity;
    Double totalPrice;

    public Food(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public Food(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        getTotalPrice();
    }

    public Food(String name) {
        this.name = name;
    }
    public double getTotalPrice() {
     totalPrice = quantity * price;
     return totalPrice;
    }

    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

