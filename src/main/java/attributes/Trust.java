package attributes;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class Trust extends Attribute {
  public static String ATTRIBUTE_NAME = "Trust";
  public Trust() {
    super(ATTRIBUTE_NAME, 1);
  }

  public Trust(int value) {
    super(ATTRIBUTE_NAME, value);
  }
}
