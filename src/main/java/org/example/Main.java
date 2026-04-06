package org.example;

import org.example.Builder.Pizza;
import org.example.Builder.PizzaBuilder;
import org.example.FactoryMethod.Document;
import org.example.FactoryMethod.PDFFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));
        // Factory Method
        Document doc = new PDFFactory().createDocument();
        doc.addText("Hello, This is Nick");
        doc.save();

        // Builder
        PizzaBuilder PB = new PizzaBuilder();
        PB.addDough();
        PB.addCheese();
        Pizza pizza = PB.build();

    }
}
