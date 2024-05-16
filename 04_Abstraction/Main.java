/*
- Abstraction
- 
- Abstraction is the concept of showing only essential features and hiding non-essential details.
- 
- Benefits:
- 1. Simplifies Complex Systems

- 1. Reduces Complexity

- 1. Improves Code Reusability

- 1. Enhances Security

- 
- Abstract Class:
- 1. Partial Implementation (provides some implementation)

- 1. Incomplete Class (cannot be instantiated)

- 1. Blueprint for Subclasses

- 
- Abstract Method:
- 1. Declaration without Implementation

- 1. Must be Implemented by Subclasses

- 1. Defines Interface for Subclasses

- 
- Abstract Keyword:
- 1. Denotes Abstract Classes and Methods

- 1. Indicates Incomplete Implementation

- 1. Forces Subclasses to Implement Abstract Methods

*/

abstract class Shape {
  abstract public double area();
  
  public void displayMessage() {
  System.out.println("This is an abstract class");
  }
  }
  
  class Circle extends Shape {
  double radius;
  
  public Circle(double radius) {
  this.radius = radius;
  }
  
  @Override
  public double area() {
  return 3.14 * (radius * radius);
  }
  }
  
  class Rectangle extends Shape {
  int length;
  int width;
  
  public Rectangle(int length, int width) {
  this.length = length;
  this.width = width;
  }
  
  @Override
  public double area() {
  return length * width;
  }
  }
  
  public class Main {
  public static void main(String[] args) {
  Circle myCircle = new Circle(5.8);
  System.out.println(myCircle.area());
  
  Rectangle Rec = new Rectangle(8, 5);
  System.out.println(Rec.area());
  Rec.displayMessage();
  }
  }