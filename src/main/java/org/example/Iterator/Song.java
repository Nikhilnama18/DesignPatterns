package org.example.Iterator;

public class Song {
    public Integer id;
    public String title;
    public String singer;

    private static Integer songId = 1;

    public Song(String title, String singer){
        this.id = songId;
        this.title = title;
        this.singer = singer;
        songId+=1;
    }

    public String getName() {
        return singer;
    }

    public String getTitle() {
        return title;
    }

    public void play(){
        System.out.println("Playing song " + this.title);
    }
}
