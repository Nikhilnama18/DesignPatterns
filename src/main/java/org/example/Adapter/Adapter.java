package org.example.Adapter;

public class Adapter implements  MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public Adapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void playMP3(String fileName) {
        // Convert mp3 file to vlc file
        System.out.println("Converting mp3 file to vlc....");
        advancedMediaPlayer.playVLC("Playing converted file"+ fileName);
    }
}
