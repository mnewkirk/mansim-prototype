package actions.proto.skills;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;
import skills.Skill;

/**
 * Also note, this action should take effect on *each* user in the pair.
 * @author Matt Newkirk 1/7/2016
 */
public class TrainOtherInSkill extends Action {
  public TrainOtherInSkill() {
    String actionName = "Train Other Person In Skill";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 1);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, 1);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -2);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }

  public void performTraining(Skill trainerSkill, Skill traineeSkill, int points) {
    trainerSkill.increaseSkill(points);
    traineeSkill.increaseSkill(points * 2);
  }
}
