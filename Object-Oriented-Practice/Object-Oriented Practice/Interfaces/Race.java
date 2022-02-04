public class Race {
	public static boolean RUNQMI(FastCar mycar) {
		
		if(mycar.accelerate(86) > 100 && mycar.brake(6) > 15)//calls the 
		//FastCar implements when making the comparison
		{
			return true;//returns true, because 86+15 = 101 > 100 and 
			            //6+10 = 16 > 15.
		}
		return false;
	}
} 