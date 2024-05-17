package com.perscholas.java_basics.slides_303_13;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {
    public static void main(String[] args) {

        try {
            File output = new File("output.txt");

            FileWriter fileWriter = new FileWriter("output.txt", true);
            fileWriter.write("This is my first sentence writing to a file.\n");
            fileWriter.flush();         // This command is used to free up the buffer and push java to write in the file immediately

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            File output = new File("output.txt");

            FileWriter fileWriter = new FileWriter("output.txt", true);
//            FileWriter fileWriter = new FileWriter("output.txt", false);    // false is used to overwrite the existing file

            fileWriter.write("================================================\n");
            fileWriter.flush();         // This command is used to free up the buffer and push java to write in the file immediately

            for(int i = 0; i < 10; i++) {
                fileWriter.write(i+1 + ") This is my second sentence writing to a file.\n");
            }
            fileWriter.flush();         // This command is used to free up the buffer and push java to write in the file immediately

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
