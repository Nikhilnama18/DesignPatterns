package org.example.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;


    public Playlist(){
        this.songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        this.songs.add(song);
    }

    public void addDefaultSongs(){
        Song s1 = new Song("Pushpa", "Sukumar" );
        Song s2 = new Song("RRR", "Rajamouli");
        Song s3 = new Song("KGF", "Prashant Neel");

        this.songs.add(s1);
        this.songs.add(s2);
        this.songs.add(s3);
    }
}
