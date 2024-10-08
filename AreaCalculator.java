package Assignment5;
public class AreaCalculator {

	   
    public void printArea(double side) {
        double area = side * side;
        System.out.printf("Area of the square: %.2f\n", area);
    }

    
    public void printArea(double length, double breadth) {
        double area = length * breadth;
        System.out.printf("Area of the rectangle: %.2f\n", area);
    }

   
    public void printPerimeter(double side) {
        double perimeter = 4 * side;
        System.out.printf("Perimeter of the square: %.2f\n", perimeter);
    }

   
    public void printPerimeter(double length, double breadth) {
        double perimeter = 2 * (length + breadth);
        System.out.printf("Perimeter of the rectangle: %.2f\n", perimeter);
    }

    
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        
        double squareSide = 5.0;
        calculator.printArea(squareSide);
        calculator.printPerimeter(squareSide);

        
        double rectangleLength = 10.0;
        double rectangleBreadth = 4.0;
        calculator.printArea(rectangleLength, rectangleBreadth);
        calculator.printPerimeter(rectangleLength, rectangleBreadth);
    }
}

