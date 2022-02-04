public class Main {
  public static void main(String[] args) {
    Greeter worldGreeter = new Greeter("World");
    String greeting = worldGreeter.sayHello(); //to invoke methods of a created 
    //object's class, use a "." Dots can also invoke methods, but there's some 
    //caveats, shown later.

    System.out.println(greeting);
    //OR can be all done at once.
    System.out.println(new Greeter("World").sayHello() + "\n"); 

    //what about updating? 
    worldGreeter.Update("Updated world"); //go to worldGreeter and update method
    System.out.println(greeting + " still when we get back from\n    the "+
    "Update method.\n");
    System.out.println("Java passes in a “pointer” to an argument’s address, "+
    "but the\nreceiving function receives a copy, and cannot alter the "+
    "original\nargument by itself (without a wrapper)\n"); 

    Greeter from_here = new Greeter("my friend");
    main2(from_here);//only works, because main2 is also static. 
    Main3.main3("there, you");//classname.methodname b/c invoking static class 
                              //main3 which exists outside Main!
    
    //Tries and catches
    TriesAndCatches.testMethod(null); 

    int x = Greeter.s + 1; 
    System.out.println("s is public static int declared within Greeter. x "+
    "(created in \nmain), is s+1. s equals 3, so x is: " +x); 
    System.out.println("static objects are acted upon by objects or primitive"+
    " types.");

    System.out.println("\n");
    //... now on to polymorphism.//
    Polymorphism.poly(); 
  }
  public static void main2(Greeter to_here) { //if this were not static, 
                                              //couldn't be called from line 20 
                                              //in main (which is also static). 
                                              //If the invocation was attached 
                                              //to an object, it could though.
    String greeting2 = to_here.sayHello();
    System.out.println(greeting2);
  }
}
