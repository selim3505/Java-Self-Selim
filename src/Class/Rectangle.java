package Class;
/*

2. Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */
public class Rectangle {
    public double length;
    public double width;
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter(){
        return 2*length+2*width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
