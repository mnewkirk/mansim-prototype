package actions.proto.projects;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class AllowTimeSideProjects extends Action {
  public AllowTimeSideProjects() {
    String actionName = "Allow Time For Side Projects";
    ActionBuilder actionBuilder =
      new ActionBuilder(actionName);
    actionBuilder.addAttribute(Attribute.AttributeName.trust, 1);
    actionBuilder.addAttribute(Attribute.AttributeName.motivation, 2);
    actionBuilder.addAttribute(Attribute.AttributeName.time, -2);
    Action action = actionBuilder.build();
    this.name = actionName;
    this.attributesActedUpon = action.getAttributesActedUpon();
  }
}
