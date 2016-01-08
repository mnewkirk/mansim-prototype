package actions.proto.worklife;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class OptimizeWorkOverLife extends Action {
  public OptimizeWorkOverLife() {
    String actionName = "Optimize Work Over Life in Work/Life Balance";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, -1);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, -2);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -1);
    actionBuilder.addAttribute(Attribute.AttributeName.stress, 10);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
