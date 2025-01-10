public class RectangleEncapsulate {

    private double widht;
    private double lenght;


    public RectangleEncapsulate(double widht, double lenght) {
        this.widht = widht;
        this.lenght = lenght;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        if (widht < 0) {
            throw new IllegalArgumentException("widht cannot be negative");
        }
        this.widht = widht;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        if (lenght < 0) {
            throw new IllegalArgumentException("lenght cannot be negative");
        }
        this.lenght = lenght;
    }

    public double calculateArea() {
        return widht * lenght;
    }
    public double calculatePerimeter() {
        return 2 * widht * lenght;

    }

    public String toString() {
        return "RectangleEncapsulate{" +
                "widht=" + widht +
                ", lenght=" + lenght +
                " , area= " + calculateArea() +
                " , perimeter= " + calculatePerimeter() +
                '}';
    }
}




