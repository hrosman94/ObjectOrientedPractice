public class Main4{
public static void go () {
    System.out.println("INTERFACES\n");
    FastCar mycar = new FastCar(); //make a FastCar.
    boolean iWon = Race.RUNQMI(mycar); //invoke method on mycar
    if (iWon) {
    	System.out.println("\nYeah, you win!");
    }
    else {
    	System.out.println("\nDang, you lost.");
    }
    //... now let's do arrays//
    Arrays.arrays(); 
	}
}
