public class Polymorphism {//MULTIPLE objects have MULTIPLE of same method//
  public static void poly(){
    Bird a = new Bird(); 
    a.sing(); 
    /*easy! one form, but if there's a class that's related that can use the 
    same method, that's when we invoke polymorphism.*/
    Pelican b = new Pelican();
    b.sing(); 
    //INHERITS tweet! BUT... what if we have a bird that ALSO has a sing 
    //function? Which will it choose?
    BlueJay c = new BlueJay();
    c.sing(); 
    /*it prioritizes the one written explicitly in the class!
    So a different version of a Bird object (say a Crow) can invoke a sing 
    method that"CAWs" instead of "tweets." Different than inheritance, in which 
    a Robin could "tweet" just like a Bird could "tweet". */
    //... now onto inheritance//
    Inheritance.inher(); 
  }
}

class Robin extends Bird{ //extends -> everytime we make a Robin, it knows 
                          //everything inside of bird class.
}
class Pelican extends Bird {
}
class BlueJay extends Bird {
  public void sing() {
    System.out.println("CA-CAW!"); 
  }

}
class Bird {
  public void sing() {
    System.out.println("tweet tweet!");
  }
}