package attributes;

/**
 * This describes a core attribute.
 * @author Matt Newkirk 1/6/2016
 */
public class Attribute {
  public enum AttributeName{ motivation, stress, time, trust }

  String name;
  int value;

  public Attribute(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }

  public void increaseAttribute(int points) {
    value = Math.min(100, value + points);
  }

  public static AttributeName getAttributeName(String name) {
    return AttributeName.valueOf(name.toLowerCase());
  }

  @Override
  public String toString() {
    return name + ": " + value;
  }
}
