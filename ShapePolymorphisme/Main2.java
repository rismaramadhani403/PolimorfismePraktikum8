/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapePolymorphisme;

/**
 *
 * @author ASUS
 */
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double area() {
        return w * h;
    }
}

public class Main2 {
    public static void main(String[] args) {
        java.util.List<Shape> shapes = new java.util.ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(2));

        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }

        System.out.println("Total area = " + total);
    }
}
