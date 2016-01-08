package actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class Action {
  protected String name;
  protected Map<Attribute.AttributeName, Integer> attributesActedUpon =
    new HashMap<>();

  public Action(String name,
                Map<Attribute.AttributeName, Integer> attributesActedUpon) {
    this.name = name;
    this.attributesActedUpon = attributesActedUpon;
    for (Attribute.AttributeName attributeName :
      Attribute.AttributeName.values())
    {
      attributesActedUpon.putIfAbsent(attributeName, 0);
    }
  }

  public Action() {
  }

  public Map<Attribute.AttributeName, Integer> getAttributesActedUpon() {
    return attributesActedUpon;
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(name);
    stringBuilder.append("\n");
    List<Attribute.AttributeName> sortedAttributeNames =
      new ArrayList<>(attributesActedUpon.keySet());
    Collections.sort(sortedAttributeNames);
    for (Attribute.AttributeName attributeName : sortedAttributeNames) {
      stringBuilder.append(attributeName).
        append(": ").
        append(attributesActedUpon.get(attributeName)).
        append("\n");
    }
    return stringBuilder.toString();
  }

}
