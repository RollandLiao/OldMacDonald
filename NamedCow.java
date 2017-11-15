class NamedCow extends Cow {
  private String myType;     
  private String mySound; 
  private String myName;
  public NamedCow(String dType, String name, String dSound) {
    myType = dType;         
    mySound = dSound;
    myName = name;
  }
  public NamedCow() {         
    myType = "unknown";         
    mySound = "unknown";
    myName = "unknown";
  }      
  public String getSound() {
    return mySound;
  }     
  public String getType() {
    return myType;
  }
  public String getName() {
    return myName;
  }
}
