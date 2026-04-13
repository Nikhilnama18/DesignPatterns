package org.example.Memento;

import java.util.Stack;

public class History implements  Memento{
    private Stack<TextEditor.State> history = new Stack<>();

    @Override
    public void save(TextEditor editor) {
            history.push(editor.save());
    }

    @Override
    public void undo(TextEditor editor) {
            if(history.size()>1){
                history.pop();
                editor.restore(history.peek());
            }
    }
}
