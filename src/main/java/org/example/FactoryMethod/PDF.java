package org.example.FactoryMethod;

public class PDF implements Document{
    private static  String document;

    PDF(){
        document = "";
    }

    public void addText(String text){
        document+= text;

    }

    @Override
    public void save() {
        System.out.println("Document is: " + document);
    }
}
