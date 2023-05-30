package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

public class CopyRawDataApp {

    public static void main(String[] args) {
        int b = 0;
        int count = 0;
        byte[] buffer = new byte[4096];     // 4KB
        long start, end;
        double elapsed;

        start = System.currentTimeMillis();
        try (FileInputStream in = new FileInputStream("C:/jtmp/v1.mp4");
             FileOutputStream out = new FileOutputStream("C:/jtmp/v1out.mp4")) {

            while ((b = in.read(buffer)) != -1) {
                out.write(buffer, 0, b);
                count += b;

            }
            end = System.currentTimeMillis();

            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + " secs");
            System.out.printf(Locale.US, "%,.2f KB\n", Math.ceil((double) count / 1024));
            System.out.printf("%d MB", count / (1024 * 1000));

        } catch (IOException e) {
            //e.printStackTrace();
            throw new RuntimeException();       // δεν είναι απαραίτητο να το βάλουμε στην επικεφαλίδα
        }
    }
}
