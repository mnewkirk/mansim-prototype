package actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Matt Newkirk 1/12/2016
 */
public class ChoiceHistory {
  List<Choices> choiceHistory;

  public ChoiceHistory() {
    choiceHistory = new ArrayList<>();
  }

  public void addChoiceMade(Choices choices) {
    choiceHistory.add(choices);
  }

  public List<Choices> getChoiceHistory() {
    return choiceHistory;
  }

  @Override
  public String toString() {
    if (choiceHistory.isEmpty()) {
      return "No choices made.";
    }
    StringBuilder sb = new StringBuilder();
    for (Choices choices : choiceHistory) {
      sb.append(choices.getChoiceSelected().toString());
      sb.append("\n");
    }

    return sb.toString();
  }
}
