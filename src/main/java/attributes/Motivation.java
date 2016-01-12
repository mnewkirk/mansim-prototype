package attributes;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class Motivation extends Attribute {
  public static String ATTRIBUTE_NAME = "Motivation";
  public Motivation() {
    super(ATTRIBUTE_NAME, 1);
  }
  public Motivation(int value) {
    super(ATTRIBUTE_NAME, value);
  }
}
