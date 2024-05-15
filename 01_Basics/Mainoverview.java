
/**
- Overview
- 
- One Java file can only have one public class.
- 
- Class:
-     - A blueprint or template.
-     - Doesn't occupy memory at runtime.
-     - Defines properties (variables) and methods (functions).
- 
- Object:
-     - An instance of a class, representing a real-world entity.
-     - Multiple objects can be created from a single class.
-     - Objects have properties (variables) and methods (functions).
- 
- Properties:
-     - Define the state or characteristics of an object or class.
- 
- Method:
-     - The behavior or action of a class or object.
*/


class overview {

  
}

public class Mainoverview {

  public static void main(String[] args) {
    person p1 = new person(); // this is our 1st object
    p1.name = "Huzaifa Gulzar";
    p1.age = 24;
    System.out.println("My name is: " + p1.name);
    System.out.println("My age is: " + p1.age);

    person p2 = new person(); //this is 2nd object this takes different storage space and values
    p2.name = "Babar";
    p2.age = 22;
    System.out.println("My name is: " + p2.name);
    System.out.println("My age is: " + p2.age);

    p1.walk();
    p1.walk(6);
    p2.eat();



  }
}

/**
 * person
 */
class person {
 
  public String name;//Property 1
  public int age; //Property 2

//Methods
  void walk(){
    System.out.println(name + " is Walking."); 
  } 
  void eat(){
    System.out.println(name + " is eating.");
  }
  //Method with parameter
  void walk(int steps){
    System.out.println(name + " walked " + steps + " steps");
  }
}