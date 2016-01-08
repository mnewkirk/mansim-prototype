package actions.proto.firing;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * Note: This does not perform the actual firing act. Also note that this impacts
 * the hiring pool, not implemented here.
 * @author Matt Newkirk 1/7/2016
 */
public class FirePersonWithoutWarning extends Action {
  public FirePersonWithoutWarning() {
    String actionName = "Fire Person Without Warning";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, -50);
    actionBuilder.addAttribute(Attribute.AttributeName.stress, 50);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -1);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
