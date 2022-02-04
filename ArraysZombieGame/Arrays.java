public class Arrays {
  public static void arrays() {

  System.out.println("\n***ARRAYS***\n");
  System.out.println("Array of zombies game!");

  Gun [] gun = new Gun[3]; //Gun array called gun will have 3 new Guns

  System.out.println("  Backpack items:"); 
  for (int i = 0; i < 3; i++)
  {
    gun[i] = new Gun(i);
    System.out.println("    " + gun[i].display()); 
  }
  String zombies[] = {"  Close-range zombie","Mid-range zombie", 
  "Long-range zombie"}; 
  System.out.println(zombies[0]+" incoming!"); 
   if(gun[0].display() == "shotgun"){
     System.out.println("    BAM! You win!"); 
   }
   else 
   {
     System.out.println("    YOU ARE DEAD");
   }
   gun[0].display(); 
  }
}