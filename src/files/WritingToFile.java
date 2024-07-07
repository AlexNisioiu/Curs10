package files;

import java.io.*;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt",true));
        writer.write("this is from ");
        writer.newLine();
        writer.flush();

    }
}
