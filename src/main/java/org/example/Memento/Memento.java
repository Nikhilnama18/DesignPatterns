package org.example.Memento;

public interface Memento {
    public void save(TextEditor editor);
    public void undo(TextEditor editor);
}
