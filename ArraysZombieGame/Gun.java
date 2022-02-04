public class Gun {
    public Gun (int option) {
    if (option == 0) {
      type = "shotgun";
    }
    else if (option == 1) {
      type = "sniper";
    }
    else if (option == 2) {
      type = "MG";
    }
  }
  public String display() {
    return type; 
  }
  private String type; 
}