package uk.ac.cam.bjc76.supohw.Supo3.Question5;

import java.util.Optional;

public class TCPconnection {
    private boolean isConnected = false;
    private Optional<String> ip = Optional.empty();
    private int messageSends;


    public void connect () {
        //Logic to connect to server
        System.out.println("Connected");
        ip = Optional.of("234.54.1.193");
        isConnected = true;
    }

    public void sendMessage (String msg) {
        if (isConnected) {
            //send message
            messageSends++;
        }
    }

}
