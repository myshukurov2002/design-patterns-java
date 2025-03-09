package behavioral.memento;

import java.util.Stack;

public class History {

    private Stack<TextMemento> history = new Stack<>();

    public void saveState(TextEditor textEditor){
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if (!history.isEmpty()) {
            textEditor.restore(history.pop());
        }
    }
}
