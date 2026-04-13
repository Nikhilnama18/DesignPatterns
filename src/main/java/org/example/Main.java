package org.example;

import org.example.Adapter.*;
import org.example.Builder.Pizza;
import org.example.Builder.PizzaBuilder;
import org.example.ChainOfResponsibility.ChainOfResponsibility;
import org.example.ChainOfResponsibility.Logger;
import org.example.Command.*;
import org.example.FactoryMethod.Document;
import org.example.FactoryMethod.PDFFactory;
import org.example.Iterator.*;
import org.example.Memento.History;
import org.example.Memento.TextEditor;
import org.example.Observer.CurrentConditionsDisplay;
import org.example.Observer.FuturePredictor;
import org.example.Observer.Observer;
import org.example.Observer.WheatherForecast;
import org.example.Prototype.CarMaker;
import org.example.Singleton.GoogleCloudConnector;
import org.example.State.RegistrationForm;
import org.example.Strategy.BubbleSort;
import org.example.Strategy.Sorter;

import java.util.ArrayList;
import java.util.List;

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

        // Observer
        WheatherForecast wheatherForecast = new WheatherForecast();
        Observer ccD = new CurrentConditionsDisplay();
        Observer weatherPredictor = new FuturePredictor();

        wheatherForecast.registerObserver(ccD);
        wheatherForecast.registerObserver(weatherPredictor);

        wheatherForecast.setWheather(25, 12, 200);
        wheatherForecast.setWheather(5, 30, 170);

        // Command
        TV tv = new TV(10, "Off");
        Command on = new TurnOnCommand(tv);
        Command off = new TurnOffCommand(tv);
        Command volUp = new VolumeDownCommand(tv);
        Command volDown = new VolumeDownCommand(tv);

        Remote remote = new Remote();

        remote.pressButton(on);
        remote.pressButton(volUp);
        remote.pressButton(volUp);
        remote.pressButton(volUp);
        remote.pressButton(volDown);
        remote.pressButton(off);

        // Iterator
        Playlist playlist = new Playlist();
        playlist.addDefaultSongs();

        Iterator<Song> sName = new SongNameIterator(playlist);
        Iterator<Song> sTitle = new SongTitleIterator(playlist);

        sName.getCurrent().play();
        if(sName.hasNext())
            sName.next();
        sName.getCurrent().play();

        sTitle.getCurrent().play();
        if(sTitle.hasNext())
            sTitle.next();
        sTitle.getCurrent().play();

        // State
        RegistrationForm form = new RegistrationForm();
        form.displayCurrentStep();
        form.enterData("Nikhil", "nick1111");
        form.displayCurrentStep();

        form.next();
        form.enterData("SDE 2", "4");
        form.next();
        form.previous();
        form.displayCurrentStep();

        // Strategy
        Sorter sorter = new Sorter(new BubbleSort());
        List<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(2);

        List<Integer> sortedEle = sorter.sort(arr);

        for (Integer num : sortedEle){
            System.out.println(num);
        }

        // Memento
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Hello");
        history.save(editor);

        editor.setText("Welcome everyone");
        history.save(editor);

        System.out.println("Current text is: " + editor.getText());
        history.undo(editor);
        System.out.println("Text after undo is: " + editor.getText());
    }
}
