package actions.proto.skills;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;
import skills.Skill;

/**
 * Note: This does not include the actual transfer of knowledge from one user's skill to the other.
 * @author Matt Newkirk 1/7/2016
 */
public class LearnSkillOnOwn extends Action {
  public LearnSkillOnOwn() {
    String actionName = "Train Other Person In Skill";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 1);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -4);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }

  public void performTrain(Skill skill, int points) {
    skill.increaseSkill(points);
  }
}
