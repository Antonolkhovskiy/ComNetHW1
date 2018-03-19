import java.net.*;
import java.io.*;


/**
 * Created by Anton on 19.03.2018.
 */
public class UDPServer {

    public static void main(String[] args) throws Exception{

        DatagramSocket datagramSocket = new DatagramSocket();

        byte [] msgInBytes = "message kak ni kak".getBytes();

        InetAddress inetAddress = InetAddress.getByName("localhost");

        int port = 2002;

        DatagramPacket datagramPacket = new DatagramPacket(msgInBytes, msgInBytes.length, inetAddress, port);

        datagramSocket.send(datagramPacket);
    }
}
