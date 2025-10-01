package org.example;

public class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle() {
        super();
        this.width = -1.0;
        this.height = -1.0;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle:\nwidth=" + width + ",\nheight=" + height + ",\narea=" + String.format("%.2f", getArea()) + ",\nperimeter=" + String.format("%.2f", getPerimeter()) + "\n" + super.toString();
    }

}