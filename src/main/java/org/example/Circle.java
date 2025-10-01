package org.example;

public class Circle extends GeometricObject{

    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Круг:\nРадиус=" + radius + ",\nПлощадь= " + String.format("%.2f", getArea()) + ",\nПериметр=" + String.format("%.2f", getPerimeter()) + "\n" + super.toString();
    }
}