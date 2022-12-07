package WorkWithFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void writeTextFile(String fileName, String copyFile) {
        FileWriter output;
        try {
            output = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(output);
            writer.write(copyFile);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static void DeleteSpaces(String fileName){



    }
}
