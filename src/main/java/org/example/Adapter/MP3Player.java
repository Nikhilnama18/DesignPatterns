package org.example.Adapter;

public class MP3Player implements MediaPlayer{
    @Override
    public void playMP3(String fileName) {
        System.out.println("Playing Mp3 music file: " + fileName);
    }
}
