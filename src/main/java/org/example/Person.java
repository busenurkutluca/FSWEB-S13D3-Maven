package org.example;

public class Person {
    // Instance variables (sınıf değişkenleri)
     String firstName;
     String lastName;
     int age;
     int number;
     String studentGrade;
     String branch;

    // Constructor chaining: This constructor calls the other one
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int number, String studentGrade, String branch) {
        this(firstName, lastName, age);  // Constructor chaining
        this.number = number;
        this.studentGrade = studentGrade;
        this.branch = branch;
    }

    // Default constructor
    public Person() {
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public String getBranch() {
        return branch;
    }

    // Method to check if age is between 13 and 19
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    // Setter methods (if you want to modify values after object creation)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
