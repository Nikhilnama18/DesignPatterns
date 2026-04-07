package org.example;

import org.example.Adapter.*;
import org.example.Builder.Pizza;
import org.example.Builder.PizzaBuilder;
import org.example.ChainOfResponsibility.ChainOfResponsibility;
import org.example.ChainOfResponsibility.Logger;
import org.example.FactoryMethod.Document;
import org.example.FactoryMethod.PDFFactory;
import org.example.Prototype.CarMaker;
import org.example.Singleton.GoogleCloudConnector;

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

        // Prototype
        CarMaker cm1 = new CarMaker("Red");
        CarMaker cm2 = cm1.clone();

        // Singleton
        GoogleCloudConnector gcc = GoogleCloudConnector.getInstance();

        // Adapter
        MediaPlayer player = new MP3Player();
        player.playMP3("Title track MP3 file");

        AdvancedMediaPlayer advPlayer = new AdvancePlayer();
        advPlayer.playVLC("High number track VLC file");

        Adapter adapter = new Adapter(advPlayer);
        adapter.playMP3("Title track MP3 file");

        // ChainOfResponsibility
        Logger logger = ChainOfResponsibility.getChainOfLoggers();

        logger.logMessage(Logger.INFO, "It's an info log");
        logger.logMessage(Logger.ERROR, "It's an error log");
    }
}
