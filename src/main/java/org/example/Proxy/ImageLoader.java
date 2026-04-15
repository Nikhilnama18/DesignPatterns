package org.example.Proxy;

public class ImageLoader implements Image {
    private String fileName;

    public ImageLoader(String fileName){
        this.fileName = fileName;
        this.loadImage(fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("Loading image from disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image from " + this.fileName);
    }
}
