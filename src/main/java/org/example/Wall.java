package org.example;

public class Wall {
    // Instance variables
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        this.width = width > 0 ? width : 0; // Set width, ensure it's non-negative
        this.height = height > 0 ? height : 0; // Set height, ensure it's non-negative
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width >= 0 ? width : 0; // Ensure width is non-negative
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height >= 0 ? height : 0; // Ensure height is non-negative
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }
}
