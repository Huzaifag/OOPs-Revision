/*
- Inheritance
- 
- Inheritance allows a new class to use the properties and methods of an existing class.
- 
- Benefits:
-     1. Code Reusability
-     1. Hierarchical Classification (parent-child relationship)
-     1. Extensibility (adding unique attributes and methods)
- 
- Parent Class (Superclass):
-     1. Foundation (common attributes and behaviors)
-     1. Generalization (represents a general concept)
-     1. Independent Existence (can exist independently)
- 
- Child Class (Subclass):
-     1. Specialization (inherits attributes and methods)
-     1. Inherited Features (automatically acquires non-private properties and methods)
-     1. Multiple Inheritance (combining different behaviors, not supported in Java)
- 
- Super Keyword:
-     1. Access Parent Class Features (access methods and properties)
-     1. Constructor Calls (call parent class constructor)
-     1. Avoid Naming Conflicts (distinguish between parent and child class methods/properties)
*/

class Shapes {
  String color;
  
  public Shapes(String color) {
  this.color = color;
  }
  
  public void displayColor() {
  System.out.println("My color is " + color);
  }
  
  public double area() {
  return 0;
  }
  }
  
  class Circle extends Shapes {
  String name;
  double radius;
  
  public Circle(String name, String color, double radius) {
  super(color);
  this.name = name;
  this.radius = radius;
  }
  
  @Override
  public double area() {
  return 3.14 * (radius * radius);
  }
  }
  
  class Rectangle extends Shapes {
  String name;
  int length;
  int width;
  
  public Rectangle(String name, String color, int length, int width) {
  super(color);
  this.name = name;
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
  Circle myCircle = new Circle("myCircle", "pink", 5.8);
  myCircle.displayColor();
  System.out.println(myCircle.area());
  
  Rectangle Rec = new Rectangle("myRec", "Red", 8, 5);
  System.out.println(Rec.area());
  Rec.displayColor();
  }
  }
  