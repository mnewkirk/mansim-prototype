package attributes;

import org.w3c.dom.Attr;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class Time extends Attribute {
  public static String ATTRIBUTE_NAME = "Time";
  public Time() {
    super(ATTRIBUTE_NAME, 1);
  }

  public Time(int value) {
    super(ATTRIBUTE_NAME, value);
  }
}
