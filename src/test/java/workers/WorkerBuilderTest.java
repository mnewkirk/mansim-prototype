package workers;

import org.testng.Assert;
import org.testng.annotations.Test;

import attributes.Time;
import attributes.Trust;

/**
 * @author Matt Newkirk 1/11/2016
 */
public class WorkerBuilderTest {
  @Test
  public void testDefaultWorker() {
    Worker worker = new WorkerBuilder().build();
    Trust trust = new Trust();
    Assert.assertEquals(worker.getAttributeValue(trust.getName()),
      trust.getValue());
  }

  @Test
  public void testSetTimeWorker() {
    Time time = new Time(100);
    Worker worker = new WorkerBuilder().addAttribute(time).build();
    Time defaultTime = new Time();
    Assert.assertEquals(
      worker.getAttributeValue(time.getName()), time.getValue());
    Assert.assertNotEquals(worker.getAttributeValue(time.getName()),
      defaultTime.getValue());
  }


}
