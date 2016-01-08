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

  @Override
  public String toString() {
    return name + ": " + value;
  }
}
