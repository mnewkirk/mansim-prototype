package workers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import attributes.Attribute;
import attributes.Motivation;
import attributes.Stress;
import attributes.Time;
import attributes.Trust;
import skills.Skill;

/**
 * @author Matt Newkirk 1/11/2016
 */
public class WorkerBuilder {
  Worker worker;
  String name;
  HashMap<String, Skill> skills;
  HashMap<Attribute.AttributeName, Attribute> attributes;
  public WorkerBuilder() {
    this.worker = new Worker();
    skills = new HashMap<>();
    attributes = new HashMap<>();
    name = null;
  }

  public WorkerBuilder name(String name) {
    this.name = name;
    return this;
  }

  public WorkerBuilder addSkill(String skillName, int value) {
    skills.put(skillName, new Skill(skillName, value));
    return this;
  }

  public WorkerBuilder addAttribute(Attribute attribute) {
    attributes.put(Attribute.AttributeName.valueOf(
        attribute.getName().toLowerCase()), attribute);
    return this;
  }

  public void defaultName() {
    if (name == null) {
      name = "Worker";
    }
    worker.setName(name);
  }

  public void defaultSkills() {
    if (skills.isEmpty()) {
      addSkill("Build", 10);
      addSkill("Analyze", 10);
    }
    worker.setSkills(skills);
  }

  public void defaultAttributes() {
    if (attributes.isEmpty()) {
      addAttribute(new Motivation());
      addAttribute(new Stress());
      addAttribute(new Time());
      addAttribute(new Trust());
    }
    worker.setAttributes(attributes);
  }

  public Worker build() {
    defaultName();
    defaultSkills();
    defaultAttributes();
    return worker;
  }
}
