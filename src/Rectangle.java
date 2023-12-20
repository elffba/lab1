public class Rectangle implements Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2.0 * (width + height);
    }
    @Override
    public String type() {
        return "Rectangle";
    }
}