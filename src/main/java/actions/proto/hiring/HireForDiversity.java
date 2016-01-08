package actions.proto.hiring;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * Note: This does not perform the actual hiring act.
 * @author Matt Newkirk 1/7/2016
 */
public class HireForDiversity extends Action {
  public HireForDiversity() {
    String actionName = "Hire For Diversity";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 1);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -10);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
