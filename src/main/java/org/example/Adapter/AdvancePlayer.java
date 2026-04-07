package org.example.Adapter;

public class AdvancePlayer implements  AdvancedMediaPlayer{
    @Override
    public void playVLC(String filenName) {
        System.out.println("Playing VLC file: " + filenName );
    }
}
