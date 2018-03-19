import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Anton on 19.03.2018.
 */
public class UDPClient {

    public static void main(String[] args) throws Exception{

        DatagramSocket datagramSocket = new DatagramSocket(2002);

        byte[] messageArray = new byte[200];
        DatagramPacket datagramPacket = new DatagramPacket(messageArray, messageArray.length);

        datagramSocket.receive(datagramPacket);

        String messageInString = new String(messageArray);

        System.out.print("Paket bil polu4en\n" + messageInString + "\n");

    }
}
