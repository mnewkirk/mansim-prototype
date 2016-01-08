package actions.proto.worklife;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class OptimizeLifeOverWork extends Action {
  public OptimizeLifeOverWork() {
    String actionName = "Optimize Life Over Work in Work/Life Balance";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 5);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, 5);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -10);
    actionBuilder.addAttribute(Attribute.AttributeName.stress, -5);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
