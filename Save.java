import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.*;

public class Save {
    private FileOutputStream fOut;

    public Save(String file) throws FileNotFoundException {
        fOut = new FileOutputStream(file);
    }

    public void write(String content) {
        PrintStream out = new PrintStream(fOut);
        out.print(content);
    }
}
