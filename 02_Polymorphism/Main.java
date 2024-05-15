/*
Polymorphism:
- One method, many behaviors/forms.

Runtime Polymorphism:
- Method is determined during execution.

Compile-time Polymorphism:
- Method is determined during compilation.

Constructors:
- Special methods to create and initialize objects.

Static Keywords:
- Access class data without creating an object.
- Data is shared by all objects.

This Keyword:
- Refers to the current object.
- Used to return the current object from a method.
- Used to call constructor from other constructor

*/

class Polymorphism {
  String name;
  int age;
  static int count;
  
  //constructors
  public Polymorphism(){
    count++;
    System.out.println("I am a constructor.");
  }
  public Polymorphism(String name, int age){
  this(); //calling the upper constructor
  this.name = name;
  this.age = age;
  }
  
  void eat(){
  System.out.println(name + " is eating");
  }
  
  void eat(String food){
  System.out.println(name + " is eating " + food);
  }
  }
  
  public class Main {
  public static void main(String[] args) {
  Polymorphism person = new Polymorphism("Ali", 22);
  //This is an example of Polymorphism: same method name, different behaviors
  person.eat();
  person.eat("Paratha");
  System.out.println(Polymorphism.count);
  }
  }