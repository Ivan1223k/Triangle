package org.example;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("Круг 1:");
        System.out.println(circle1.toString());
        System.out.println();


        Rectangle rectangle1 = new Rectangle();
        System.out.println("Прямогольник 1:");
        System.out.println(rectangle1.toString());
        System.out.println();

        Triangle triangle1 = new Triangle();
        System.out.println("Треугольник 1:");
        System.out.println(triangle1.toString());
        System.out.println();

        GeometricObject myShape;

        myShape = new Circle(5.0, "Красный", true);
        System.out.println(myShape.toString());
        System.out.println();

        myShape = new Rectangle(2.0, 3.0, "Желтый", true);
        System.out.println(myShape.toString());
        System.out.println();

        myShape = new Triangle(3.0, 4.0, 5.0, "Синий", true);
        System.out.println(myShape.toString());
    }
}