public class Test {
    public static void main(String[] args) {
//Create a circle, a rectangle, and a triangle object
//Add all objects into a single array
//print objects’ type, area and perimeter info by looping the array.

        Circle circle = new Circle(8);
        Rectangle rectangle = new Rectangle(9, 18);
        Triangle triangle = new Triangle(5, 12, 13);

        Shape[] shapes = new Shape[]{circle, rectangle, triangle};

        for (int i= 0; i< shapes.length; i++) {
            System.out.println("Type: " + shapes[i].type());
            System.out.println("Area: " + shapes[i].area());
            System.out.println("Perimeter: " + shapes[i].perimeter());
        }


    }
}