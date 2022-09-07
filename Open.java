import java.io.File;
import java.util.Scanner;

public class Open {
    private Scanner input;

    public Open(String file) {
        input = new Scanner(file);
    }

    public String getContent() throws Exception {
        String content = "";
        try {
            File file = new File(input.nextLine());
            input = new Scanner(file);

            while(input.hasNextLine()) {
                String line = input.nextLine();
                content += line + "\n";
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}
