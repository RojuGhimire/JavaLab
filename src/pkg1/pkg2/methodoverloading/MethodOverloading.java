package pkg1.pkg2.methodoverloading;
import java.util.Scanner;

class Shape {
    double area;
    public Shape(double area) {
        this.area = area;
    }
    public void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(double length, double width) {
        super(0); 
        this.length = length;
        this.width = width;
        calculateArea(); 
    }
    private void calculateArea() {
        area = length * width;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    public Triangle(double base, double height) {
        super(0); 
        this.base = base;
        this.height = height;
        calculateArea(); 
    }
    private void calculateArea() {
        area = 0.5 * base * height;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and width of the rectangle:");
        double rectLength = scanner.nextDouble();
        double rectWidth = scanner.nextDouble();

        Rectangle r = new Rectangle(rectLength, rectWidth);

        System.out.print("Rectangle ");
        r.displayArea();

        System.out.println("Enter base and height of the triangle:");
        double triBase = scanner.nextDouble();
        double triHeight = scanner.nextDouble();

        Triangle t = new Triangle(triBase, triHeight);

        System.out.print("Triangle ");
        t.displayArea();

        scanner.close();
    }
}
