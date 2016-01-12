package actions.proto.projects;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class CheckInAtComfortableIntervals extends Action {
  public CheckInAtComfortableIntervals() {
    String actionName = "Check In at Comfortable Intervals";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 1);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, 2);
    actionBuilder.addAttribute(Attribute.AttributeName.stress, 0);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -1);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
