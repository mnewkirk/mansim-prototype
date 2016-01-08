package actions.proto.firing;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * Note: This does not perform the actual firing act. Also note that this impacts
 * the hiring pool, not implemented here.
 * @author Matt Newkirk 1/7/2016
 */
public class FirePersonAfterWarnings extends Action {
  public FirePersonAfterWarnings() {
    String actionName = "Fire Person After Warnings";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 10);
    actionBuilder.addAttribute(Attribute.AttributeName.stress, 10);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -5);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
