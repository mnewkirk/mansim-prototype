package engine;

import java.util.HashMap;
import java.util.Map;

import attributes.Time;
import workers.Worker;

/**
 * @author Matt Newkirk 1/11/2016
 */
public class Goal {
  private static int MAX_PROGRESS = 100;
  private static int WORK_IMPROVEMENT = 1;
  private static int WORK_COMPLETE_IMPROVEMENT = 5;

  private int progress = 0; // Up to 100
  private int iterationValue = 10;
  private String name;

  private Map<String, Integer> skillBonuses;

  public Goal(String name, int iterationValue) {
    this.name = name;
    this.iterationValue = iterationValue;
    skillBonuses = new HashMap<>();
  }

  public void setSkillBonuses(Map<String, Integer> skillBonuses) {
    this.skillBonuses = skillBonuses;
  }

  public void setSkillBonus(String skillName, int bonus) {
    skillBonuses.put(skillName, bonus);
  }

  public void performWork(Worker worker) {
    progress += iterationValue;
    for (String skillName : skillBonuses.keySet()) {
      progress += calculateSkillBonus(skillName, worker, skillBonuses.get(skillName));
      worker.improveSkill(skillName, calculateSkillImprovement(isComplete()));
    }
    worker.improveAttribute(Time.ATTRIBUTE_NAME, -1);
  }

  public int calculateSkillBonus(String skillName, Worker worker, int skillBonus) {
    int workerSkill = worker.getSkillValue(skillName);
    return skillBonus * workerSkill / 100;
  }

  public int calculateSkillImprovement(boolean isComplete) {
    if (isComplete) {
      return WORK_COMPLETE_IMPROVEMENT;
    }
    return WORK_IMPROVEMENT;
  }

  public boolean isComplete() {
    return progress > MAX_PROGRESS;
  }
}
