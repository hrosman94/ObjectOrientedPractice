public class Greeter {
  public Greeter(String aName) {//this is a constructor. doesn't have return 
  //type while methods do. this does however affect the private variable within 
  //the Greeter class (changes its name).
    name = aName;
  }
  public String sayHello() {
    return "Hello, " + name + "!";//method which applies to objects of this 
                                  //class
  }
  public String Update (String anotherName) { 
    System.out.print("Can update name HERE, in THIS scope, but can't return "+
    "the update. ");
    System.out.print ("\n" + anotherName);
    System.out.print(" passed as name, but watch:\n    ");
    name = anotherName; 
    System.out.print(name + " buuuut "); 
    return name;
  }
  private String name;//instance field; every object of this class has a 
                      //instance of this field
  public static int s =  3;
}