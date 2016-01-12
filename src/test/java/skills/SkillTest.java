package skills;

import org.testng.Assert;
import org.testng.annotations.Test;

import actions.proto.skills.LearnSkillOnOwn;
import actions.proto.skills.TrainOtherInSkill;

/**
 * @author Matt Newkirk 1/7/2016
 */
public class SkillTest {


  @Test
  public void testSkillTrainingSelf() {
    Skill skill = new Skill("Underwater Basket Weaving", 10);
    LearnSkillOnOwn learner = new LearnSkillOnOwn();
    learner.performTrain(skill, 5);

    Assert.assertEquals(skill.getValue(), 15);

    learner.performTrain(skill, 100);
    Assert.assertEquals(skill.getValue(), 100);
  }

  @Test
  public void testSkillTrainingOther() {
    String skillName = "Groking";
    Skill trainerSkill = new Skill(skillName, 60);
    Skill traineeSkill = new Skill(skillName, 10);

    TrainOtherInSkill trainer = new TrainOtherInSkill();
    trainer.performTraining(trainerSkill, traineeSkill, 10);

    Assert.assertEquals(trainerSkill.getValue(), 70);
    Assert.assertEquals(traineeSkill.getValue(), 30);
  }
}
