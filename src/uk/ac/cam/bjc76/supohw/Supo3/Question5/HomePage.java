package uk.ac.cam.bjc76.supohw.Supo3.Question5;

public class HomePage {
    private TCPconnection connection;
    private MessagePortal messagePortal1;
    private MessagePortal messagePortal2;

    public HomePage (TCPconnection connection) {
        this.connection = connection;
        messagePortal1 = new MessagePortal(connection);
        messagePortal2 = new MessagePortal(connection);
        connection.connect();
    }

}
