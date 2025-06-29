package org.krashokkumarnaidu.designpatterns.SOLID.O;

public class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    public double area() { return width * height; }
}
