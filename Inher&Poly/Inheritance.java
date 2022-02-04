public class Inheritance {//MULTIPLE of the same OBJECT can share the SAME method
  public static void inher(){
    System.out.println("INHERITANCE\n");

    /*Suppose we belong to a gaming company and we need to create 5 types of 
    gaming mice. We need to write the software for the mice.

    We can create objects for different mice. We'll create 5.

    we make the mice, and notice 1-3 all have left+right click... pretty 
    redundant. And if the company grew, and we had to make thousands of mice a 
    year, it would make our code difficult to read, and we'd have to retype or 
    copy/paste all these methods! What we can do is create a generic mouse that 
    has left+right click! Let's create it (simply called mouse.)

    //So let's create mouse 4 now!*/

    BestMouse bm = new BestMouse(); 
    bm.rightClick(); 

    /*Can click even though the method isn't there! See? Like polymorphism, 
    but in reverse. 

    //////THE BIG POINT//////
    Inheritance is one in which a new class is created (derived class) that 
    inherits the features from the already existing class(base class). AND can 
    do it's own things too. 
    
    Both polymorphism and inheritance make use of "extends"

    for more differences + similarities, there's a nice table here:
    https://www.geeksforgeeks.org/difference-between-inheritance-and-polymorphism/
    */
    //... now onto interfaces (Main4.go located in Interfaces file)//
    Main4.go(); 

  }
}
class Mouse1{
    String texture = "Matte";
    public static void leftClick() {
      System.out.println("\nClick!");
    }
    public static void rightClick (){
      System.out.println("\nClick!");
    }
    public static void setColor(String color)
    {
      System.out.println(color); 
    }
}
class Mouse2{

    public static void leftClick() {
      System.out.println("\nClick!");
    }
    public static void rightClick (){
      System.out.println("\nClick!");
    }
    public static void connect()
    {
      System.out.println("Connected to BT");
    }
  
}
class Mouse3 {

  boolean ambidextrous = true; 

  public static void leftClick() {
      System.out.println("\nClick!");
    }
    public static void rightClick(){
      System.out.println("\nClick!");
    }
  
}
class Mouse{
  public static void leftClick() {
      System.out.println("\nClick!");
    }
    public static void rightClick(){
      System.out.println("\nClick!");
    }

}

class BestMouse extends Mouse { //extends -> everytime we make a BestMouse, it 
                                //knows everything inside of Mouse class.

  String texture = "Matte";
    public static void connect()
    {
      System.out.println("Connected to BT");
    }
  boolean ambidextrous = true; 

}