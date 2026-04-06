package org.example.FactoryMethod;

public class PDFFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return  new PDF();
    }
}
