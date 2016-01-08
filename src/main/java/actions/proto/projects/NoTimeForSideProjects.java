package actions.proto.projects;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class NoTimeForSideProjects extends Action {
  public NoTimeForSideProjects() {
    String actionName = "Allow Time For Side Projects";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, -1);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, -1);
    actionBuilder.addAttribute(Attribute.AttributeName.stress, 1);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
