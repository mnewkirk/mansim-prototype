package actions.proto.firing;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * Note: This impacts all members of the remaining team.
 * @author Matt Newkirk 1/7/2016
 */
public class DishonestlyShareTerminationWithTeam extends Action {
  public DishonestlyShareTerminationWithTeam() {
    String actionName = "Dishonestly Share Why Person Was Fired With The Team";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, -20);
    actionBuilder.addAttribute(Attribute.AttributeName.stress, 20);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, -5);
    actionBuilder.addAttribute(Attribute.AttributeName.time, 5);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
