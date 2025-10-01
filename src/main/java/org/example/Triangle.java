package org.example;

import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject{
    private double Size1,Size2,Size3;

    public Triangle() {
        super();
        this.Size1 = -1.0;
        this.Size2 = -1.0;
        this.Size3 = -1.0;
    }

    public Triangle(double size1, double size2, double size3) {
        super();
        Size1 = size1;
        Size2 = size2;
        Size3 = size3;
    }

    public Triangle(double size1, double size2, double size3, String color, boolean filled) {
        super(color, filled);
        Size1 = size1;
        Size2 = size2;
        Size3 = size3;
    }

    public double getSize1() {
        return Size1;
    }
    public void setSize1(double size1) {
        Size1 = size1;
    }

    public double getSize2() {
        return Size2;
    }
    public void setSize2(double size2) {
        Size2 = size2;
    }

    public double getSize3() {
        return Size3;
    }
    public void setSize3(double size3) {
        Size3 = size3;
    }


    public double getArea() {
        double p = getPerimeter()/2;
        return sqrt(p*(p-Size1)*(p-Size2)*(p-Size3));
    }

    public double getPerimeter() {
        return Size1+Size2+Size3;
    }

    @Override
    public String toString() {
        return "Треугольник:\nСторона 1=" + Size1 + ",\nСторона 2=" + Size2 + ",\nСторона 3=" + Size3 + ",\nПлощадь=" +
                String.format("%.2f", getArea()) + ",\nПериметр=" + String.format("%.2f", getPerimeter()) + "\n" + super.toString();
    }

}