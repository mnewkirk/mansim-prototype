package workers;

import java.util.HashMap;

import attributes.Attribute;
import skills.Skill;

/**
 * @author Matt Newkirk 1/11/2016
 */
public class Worker {
  private String name;
  private HashMap<String, Skill> skills;
  private HashMap<Attribute.AttributeName, Attribute> attributes;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSkills(HashMap<String, Skill> skills) {
    this.skills = skills;
  }

  public void setAttributes(HashMap<Attribute.AttributeName, Attribute> attributes) {
    this.attributes = attributes;
  }

  public int getSkillValue(String skillName) {
    Skill skill = skills.getOrDefault(skillName, null);
    if (skill == null) {
      return 0;
    }
    return skill.getValue();
  }

  public void improveSkill(String skillName, int points) {
    Skill skill = skills.getOrDefault(skillName, null);
    if (skill == null) {
      return;
    }
    skill.increaseSkill(points);
  }

  public int getAttributeValue(String attributeName) {
    Attribute attribute
      = attributes.getOrDefault(attributeName, null);
    if (attribute == null) {
      return 0;
    }
    return attribute.getValue();
  }

  public void improveAttribute(String attributeName, int points) {
    Attribute attribute = attributes.getOrDefault(
      Attribute.AttributeName.valueOf(attributeName), null);
    if (attribute == null) {
      return;
    }
    attribute.increaseAttribute(points);
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(name);
    stringBuilder.append("\n");
    for (Attribute.AttributeName attributeName : attributes.keySet()) {
      stringBuilder.append(
        String.format("%s = %d, ",
          attributeName,
          attributes.get(attributeName).getValue()));
    }
    stringBuilder.append("\n");
    return stringBuilder.toString();
  }
}
