package engine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import workers.Worker;

/**
 * @author Matt Newkirk 1/11/2016
 */
public class GameEngine {
  private Map<Worker, Goal> goals;
  private Set<Worker> workers;

  public GameEngine() {
    goals = new HashMap<>();
    workers = new HashSet<>();
  }

  public void addWorker(Worker worker) {
    workers.add(worker);
  }

  public void initializeGoals() {
    for (Worker worker : workers) {
      goals.putIfAbsent(worker, createNewGoalForWorker(worker));
    }
  }

  public Goal createNewGoalForWorker(Worker worker) {
    return new Goal("Do some work.", 10);
  }

  public void workTowardsGoals() {
    for (Worker worker : goals.keySet()) {
      Goal goal = goals.get(worker);
      goal.performWork(worker);
      if (goal.isComplete()) {
        goals.remove(worker);
      }
    }
    if(goals.isEmpty()) {
      initializeGoals();
    }
  }
}
