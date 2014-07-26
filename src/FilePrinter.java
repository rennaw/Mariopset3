import java.io.*;

/**
 * Created by dana on 7/26/14.
 */
public class FilePrinter implements Printer {

    PrintWriter infoToWrite = null;
    String filename;

    public FilePrinter(String f) {
        filename = f;
    }

    public void print(Pyramid msg) {
        try {
            File file = new File(filename);

            infoToWrite = new PrintWriter(file);

            infoToWrite.print(msg);
            infoToWrite.close();
        } catch (IOException e) {
            System.out.println("An I/O error occurred " + e.getMessage());
        } finally {
            if (infoToWrite != null) {
                infoToWrite.close();
            }
        }

    }
}
