package actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Matt Newkirk 1/12/2016
 */
public class Choices {
  private List<Action> actions;
  private Action choiceSelected;

  public Choices(List<Action> actions) {
    this.actions = actions;
    choiceSelected = null;
  }

  public Choices(Action... givenActions) {
    actions = new ArrayList<>();
    Collections.addAll(actions, givenActions);
    choiceSelected = null;
  }

  public int getNumChoices() {
    return actions.size();
  }

  public Action getAction(int i) {
    return actions.get(i);
  }

  public void setChoiceSelected(Action action) {
    choiceSelected = action;
  }

  public Action getChoiceSelected() {
    return choiceSelected;
  }
  @Override
  public String toString() {
    if (getNumChoices() == 0) {
      return "No choices.";
    }
    StringBuilder sb = new StringBuilder();
    int i = 1;
    for (Action action : actions) {
      if (getChoiceSelected() != null && action.equals(getChoiceSelected())) {
        sb.append("Selected Action: ");
      }
      sb.append(String.format("(#%d) ", i++));
      sb.append(action);
    }
    return sb.toString();
  }
}
