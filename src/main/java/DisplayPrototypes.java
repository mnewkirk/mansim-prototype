import actions.Choices;
import actions.proto.firing.DishonestlyShareTerminationWithTeam;
import actions.proto.firing.FirePersonAfterWarnings;
import actions.proto.firing.FirePersonWithoutWarning;
import actions.proto.firing.HonestlyShareTerminationWithTeam;
import actions.proto.hiring.HireForDiversity;
import actions.proto.hiring.HireForSameness;
import actions.proto.projects.AllowTimeSideProjects;
import actions.proto.projects.CheckInAtComfortableIntervals;
import actions.proto.projects.CommunicateDesiredOutput;
import actions.proto.projects.CommunicatePrescriptedActions;
import actions.proto.projects.Micromanage;
import actions.proto.projects.NoTimeForSideProjects;
import actions.proto.skills.LearnSkillOnOwn;
import actions.proto.skills.TrainOtherInSkill;
import actions.proto.worklife.OptimizeLifeOverWork;
import actions.proto.worklife.OptimizeWorkOverLife;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class DisplayPrototypes {
  public static void main(String[] args) {
    Choices choices[] = {
      new Choices(new AllowTimeSideProjects(), new NoTimeForSideProjects()),
      new Choices(new CommunicateDesiredOutput(), new CommunicatePrescriptedActions()),
      new Choices(new Micromanage(), new CheckInAtComfortableIntervals()),
      new Choices(new HonestlyShareTerminationWithTeam(), new DishonestlyShareTerminationWithTeam()),
      new Choices(new FirePersonAfterWarnings(), new FirePersonWithoutWarning()),
      new Choices(new HireForDiversity(), new HireForSameness()),
      new Choices(new OptimizeLifeOverWork(), new OptimizeWorkOverLife()),
      new Choices(new TrainOtherInSkill(), new LearnSkillOnOwn())
    };
    System.out.println("Protypical Choices:");
    System.out.println("===================");
    for (Choices choice : choices) {
      System.out.println(choice);
    }
  }
}
