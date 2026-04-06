package org.example.FactoryMethod;

public class TextFileFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new TextFile();
    }
}
