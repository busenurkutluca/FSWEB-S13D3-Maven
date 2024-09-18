package org.example;

public class Main {
    public static void main(String[] args) {
        // First Person object using first constructor
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        // Second Person object using constructor with more parameters
        Person person2 = new Person("Jane", "Smith", 16, 112, "A", "Math");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Number: " + person2.getNumber());
        System.out.println("Student Grade: " + person2.getStudentGrade());
        System.out.println("Branch: " + person2.getBranch());
        System.out.println("Is Teen: " + person2.isTeen());

        Wall wall = new Wall(5, 4);

        // Print the area
        System.out.println("area= " + wall.getArea()); // Expected output: 20.0

        // Set height to a negative value
        wall.setHeight(-1.5);

        // Print the width, height, and area
        System.out.println("width= " + wall.getWidth()); // Expected output: 5.0
        System.out.println("height= " + wall.getHeight()); // Expected output: 0.0
        System.out.println("area= " + wall.getArea()); // Expected output: 0.0
    }
}
