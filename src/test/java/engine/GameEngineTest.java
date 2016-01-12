package engine;

import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import actions.Action;
import actions.proto.firing.DishonestlyShareTerminationWithTeam;
import actions.proto.firing.FirePersonAfterWarnings;
import actions.proto.firing.FirePersonWithoutWarning;
import actions.proto.firing.HonestlyShareTerminationWithTeam;
import actions.proto.hiring.HireForDiversity;
import actions.proto.hiring.HireForSameness;
import actions.proto.projects.AllowTimeSideProjects;
import actions.proto.projects.CommunicateDesiredOutput;
import actions.proto.projects.CommunicatePrescriptedActions;
import actions.proto.projects.Micromanage;
import actions.proto.projects.NoTimeForSideProjects;
import actions.proto.skills.LearnSkillOnOwn;
import actions.proto.skills.TrainOtherInSkill;
import actions.proto.worklife.OptimizeLifeOverWork;
import actions.proto.worklife.OptimizeWorkOverLife;
import attributes.Attribute;
import workers.Worker;
import workers.WorkerBuilder;

/**
 * @author Matt Newkirk 1/11/2016
 */
public class GameEngineTest {
  Action actions[] = {
    new AllowTimeSideProjects(),
    new CommunicateDesiredOutput(),
    new CommunicatePrescriptedActions(),
    new Micromanage(),
    new NoTimeForSideProjects(),
    new DishonestlyShareTerminationWithTeam(),
    new FirePersonAfterWarnings(),
    new FirePersonWithoutWarning(),
    new HonestlyShareTerminationWithTeam(),
    new HireForDiversity(),
    new HireForSameness(),
    new OptimizeLifeOverWork(),
    new OptimizeWorkOverLife(),
    new LearnSkillOnOwn(),
    new TrainOtherInSkill(), };

  @DataProvider
  public Object[][] attributeNames() {
    Attribute.AttributeName[] names = Attribute.AttributeName.values();
    int numValues = names.length;
    Object[][] results = new Object[numValues][1];
    for (int i = 0; i < numValues; i++) {
      results[i][0] = names[i];
    }
    return results;
  }
  @AfterClass
  public void compareToInitialWorker() {
    Worker initialWorker = new WorkerBuilder().build();
    System.out.println("Compare to untouched:\n" + initialWorker);
  }
  @Test
  public void runThroughEngine() {
    Worker firstWorker = new WorkerBuilder().build();
    System.out.println("All actions:");
    for (Action action : actions) {
      //System.out.println(action);
      Map<Attribute.AttributeName, Integer> attributes =
        action.getAttributesActedUpon();
      for (Attribute.AttributeName attributeName : attributes.keySet()) {
        firstWorker.improveAttribute(attributeName.name(), attributes.get(attributeName));
      }
    }
    System.out.println(firstWorker);
  }

  @Test(dataProvider = "attributeNames")
  public void runForHighData(Attribute.AttributeName attributeToFilter) {
    Worker firstWorker = new WorkerBuilder().build();
    System.out.println("High " + attributeToFilter.name() + " actions:");
    for (Action action : actions) {
      Map<Attribute.AttributeName, Integer> attributes =
        action.getAttributesActedUpon();
      if (attributes.getOrDefault(attributeToFilter, 0) < 1) {
        continue;
      }
      //System.out.println(action);
      for (Attribute.AttributeName attributeName : attributes.keySet()) {
        firstWorker.improveAttribute(attributeName.name(), attributes.get(attributeName));
      }
    }
    System.out.println(firstWorker);
  }

  @Test(dataProvider = "attributeNames")
  public void runForLowData(Attribute.AttributeName attributeToFilter) {
    Worker firstWorker = new WorkerBuilder().build();
    System.out.println("Low " + attributeToFilter.name() + " actions:");
    for (Action action : actions) {
      Map<Attribute.AttributeName, Integer> attributes =
        action.getAttributesActedUpon();
      if (attributes.getOrDefault(attributeToFilter, 1) > 0) {
        continue;
      }
      //System.out.println(action);
      for (Attribute.AttributeName attributeName : attributes.keySet()) {
        firstWorker.improveAttribute(attributeName.name(), attributes.get(attributeName));
      }
    }
    System.out.println(firstWorker);
  }
}
