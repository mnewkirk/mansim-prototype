package actions.proto.projects;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class CommunicateDesiredOutput extends Action {
  public CommunicateDesiredOutput() {
    String actionName = "Communicate Desired Output";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 2);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, 1);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
