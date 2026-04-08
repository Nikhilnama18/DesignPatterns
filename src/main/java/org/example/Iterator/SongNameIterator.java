package org.example.Iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SongNameIterator implements Iterator<Song>{
    private  Playlist playlist;
    List<Song>songs;
    Integer curIndex;

    public SongNameIterator(Playlist playlist){
        this.playlist= playlist;
        this.songs = new ArrayList<>();
        this.sortByName();
        this.curIndex = 0;
    }

    private void sortByName(){
        List<Song> sortedSongs = new ArrayList<>(playlist.getSongs());
        sortedSongs.sort(Comparator.comparing(Song::getName));
        this.songs = sortedSongs;
    }

    @Override
    public Boolean hasNext() {
        return curIndex + 1 < songs.size();
    }

    @Override
    public Song next() {
        if(hasNext()){
            curIndex+=1;
            return songs.get(curIndex);
        }

        return null;
    }

    @Override
    public Boolean hasPrevious() {
        return curIndex-1>=0;
    }

    @Override
    public Song previous() {
        if(hasPrevious()){
            curIndex -=1;
            return songs.get(curIndex);
        }
        return null;
    }

    @Override
    public Song getCurrent(){
        return songs.get(curIndex);
    }
}
