package org.example.Singleton;

public class GoogleCloudConnector {
    private static GoogleCloudConnector gcc;

    private GoogleCloudConnector(){}

    public static GoogleCloudConnector getInstance(){
        if(gcc == null){
            gcc= new GoogleCloudConnector();
        }
        return gcc;
    }
}
