package edu.cnm.deepdive;

public class CanisLupus extends Canis {

  private static String someText = getSomeText();

  private int wolfData = getValue();

  {
    System.out.println("Entering CanisLupus initialization block");
  }

  public CanisLupus() {
    // Do superclass initialization first
    // Do other instance initialization before constructor
   System.out.println("Entering Canis Lupus::new");
  }

  private int getValue() {
    System.out.println("Entering CanisLupus::getValue");
    return 1;
  }

  private static String getSomeText() {
    System.out.println("Entring CanisLupus::getSomeText");
    return "Hello";
  }
}
