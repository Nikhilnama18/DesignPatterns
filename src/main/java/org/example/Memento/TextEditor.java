package org.example.Memento;

public class TextEditor {
    private String text;

    public TextEditor(){
        this.text = "";
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public State save(){
        return new State(this.getText());
    }

    public void restore(State state){
        this.text = state.getText();
    }

    static class State{
        private final String text;

        public State(String text){
            this.text = text;
        }

        public String getText(){
            return this.text;
        }
    }
}
