package Class;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
    rectangle1.width = 2;
    rectangle1.length= 3;
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 4.2;
        rectangle2.length = 8.4;
        System.out.println("Rectangele Area:" + rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
        System.out.println(rectangle1);
        System.out.println(rectangle2);

    }
}
