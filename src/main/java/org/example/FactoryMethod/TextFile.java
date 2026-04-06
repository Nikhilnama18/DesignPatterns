package org.example.FactoryMethod;

public class TextFile implements Document{
    private static String document;

    TextFile(){
        document= "";
    }

    @Override
    public void addText(String text) {
        document+=text;
    }

    @Override
    public void save() {
        System.out.println("Document is " + document);
    }
}
