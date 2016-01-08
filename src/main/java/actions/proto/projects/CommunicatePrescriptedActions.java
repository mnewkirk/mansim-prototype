package actions.proto.projects;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class CommunicatePrescriptedActions extends Action {
  public CommunicatePrescriptedActions() {
    String actionName = "Communicate Prescripted Actions";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, -1);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, -2);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
