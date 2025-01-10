package ConstructorStatic;

public class FoodTest {
    public static void main(String[] args) {
        Food food1 = new Food("Pizza", 12.99, 12);
        System.out.println(food1);
        System.out.println(food1.name);
        System.out.println(food1.price);
        System.out.println(food1.quantity);
        System.out.println(food1.totalPrice);
       System.out.println("food1 = " + food1);

    }
}