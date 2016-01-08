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

/**
 * @author Matt Newkirk 1/7/2016
 */
public class DisplayPrototypes {
  public static void main(String[] args) {
    System.out.println("Prototypical Actions");
    System.out.println("====================");
    System.out.println("Projects:");
    System.out.println(new AllowTimeSideProjects());
    System.out.println(new CommunicateDesiredOutput());
    System.out.println(new CommunicatePrescriptedActions());
    System.out.println(new Micromanage());
    System.out.println(new NoTimeForSideProjects());
    System.out.println();
    System.out.println("Firing:");
    System.out.println(new DishonestlyShareTerminationWithTeam());
    System.out.println(new FirePersonAfterWarnings());
    System.out.println(new FirePersonWithoutWarning());
    System.out.println(new HonestlyShareTerminationWithTeam());
    System.out.println();
    System.out.println("Hiring:");
    System.out.println(new HireForDiversity());
    System.out.println(new HireForSameness());
    System.out.println();
    System.out.println("Work/Life Balance:");
    System.out.println(new OptimizeLifeOverWork());
    System.out.println(new OptimizeWorkOverLife());
    System.out.println();
    System.out.println("Skills:");
    System.out.println(new LearnSkillOnOwn());
    System.out.println(new TrainOtherInSkill());
  }
}
