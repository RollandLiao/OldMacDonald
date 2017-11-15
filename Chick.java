class Chick implements Animal 
{     
  //your code here
  private String myType;     
  private String mySound; 
  private String mydSound;

  public Chick() {         
    myType = "unknown";         
    mySound = "unknown";
    mydSound = "unknown";
  }   
  public Chick(String type, String sound, String dSound) {         
    myType = type;         
    mySound = sound;
    mydSound = dSound;
  }     
  public String getSound() {
    if((int)(Math.random() * 2) == 0) 
    {
      return mySound;
    } else {
    return mydSound;
    }
  }     
  public String getType() {
    return myType;
  }
}
