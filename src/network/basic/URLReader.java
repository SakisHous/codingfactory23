package network.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) throws IOException {
        URL google = new URL("https://google.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
