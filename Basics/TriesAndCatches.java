public class TriesAndCatches {
  public static void testMethod (String x) {
    try {
      System.out.println(x.length()); 
    } catch (NullPointerException e) {
      System.out.println("NullPointerException. Can't get length of null"+
      " object, so\ncatch successful.");
    } finally {
      System.out.println("The try/catch is finished.\n");
    }
  }
}
