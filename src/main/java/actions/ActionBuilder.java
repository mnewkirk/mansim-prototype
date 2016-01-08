package actions;

import java.util.HashMap;
import java.util.Map;

import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class ActionBuilder {
  private String name;
  private Map<Attribute.AttributeName, Integer> attributesActedUpon = new HashMap<>();

  public ActionBuilder(String name) {
    this.name = name;
  }

  public ActionBuilder addAttribute(
    Attribute.AttributeName attributeName, int value)
  {
    attributesActedUpon.put(attributeName, value);
    return this;
  }

  public Action build() {
    return new Action(name, attributesActedUpon);
  }
}
