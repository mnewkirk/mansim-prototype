package actions;

import org.testng.Assert;
import org.testng.annotations.Test;

import actions.Action;
import actions.ActionBuilder;
import attributes.Attribute;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class ActionTest {
  @Test
  public void testAction() {
    String actionName = "Communicate Desired Output";
    ActionBuilder communicateDesiredOutputBuilder =
      new ActionBuilder(actionName);
    communicateDesiredOutputBuilder.addAttribute(Attribute.AttributeName.trust, 2);
    communicateDesiredOutputBuilder.addAttribute(Attribute.AttributeName.stress, -1);
    communicateDesiredOutputBuilder.addAttribute(Attribute.AttributeName.motivation, 1);
    Action communicateDesiredOutputAction = communicateDesiredOutputBuilder.build();

    Assert.assertEquals(
      communicateDesiredOutputAction.toString(), "Communicate Desired Output\n" +
        "motivation: 1\n" +
        "stress: -1\n" +
        "time: 0\n" +
        "trust: 2\n");
  }
}
