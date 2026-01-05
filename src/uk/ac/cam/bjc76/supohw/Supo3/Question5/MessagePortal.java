package uk.ac.cam.bjc76.supohw.Supo3.Question5;

public class MessagePortal {
    private TCPconnection connection;

    public MessagePortal (TCPconnection connection) {
        this.connection = connection;
    }

    public void sendButtonClick (String msg) {
        connection.sendMessage(msg);
    }
}
