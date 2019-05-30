package Server;


import java.io.*;
import java.net.*;

public class DailyAdviceClient {

    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);

            InputStreamReader streamreader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamreader);

            String advice =reader.readLine();
            System.out.println("Сегодня ты должен: " + advice);

            reader.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
