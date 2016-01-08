package skills;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class Skill {
  protected String name;
  protected int value;

  public Skill(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }

  public void increaseSkill(int points) {
    value = Math.min(value + points, 100);
  }
}
