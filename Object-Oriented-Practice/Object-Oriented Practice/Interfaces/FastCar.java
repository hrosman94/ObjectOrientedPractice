public class FastCar implements Car {//implements defines methods of the 
	                                 //interface (I to I, eye-to-eye!) MUST 
									 //implement ALL the methods of the 
									 //interface.
	  public int accelerate(int mph){ 
	    return mph+15; 
	  }
	  public int brake(int pressure) {
	   return pressure+10;
	  }
}