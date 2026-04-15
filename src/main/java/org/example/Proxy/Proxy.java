package org.example.Proxy;

public class Proxy implements Image {
    private ImageLoader imageLoader;
    private String fileName;

    public Proxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(imageLoader == null){
            this.imageLoader = new ImageLoader(this.fileName);
        }
        this.imageLoader.display();
    }
}
