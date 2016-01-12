package attributes;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class Stress extends Attribute {
  public static String ATTRIBUTE_NAME = "Stress";
  public Stress() {
    super(ATTRIBUTE_NAME, 1);
  }
  public Stress(int value) {
    super(ATTRIBUTE_NAME, value);
  }
}
