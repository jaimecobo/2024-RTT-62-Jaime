package com.perscholas.java_basics.slides_303_13;

import java.io.*;

public class JavaFileReader {
//    public static void main(String[] args) {
//        File input = new File("output.txt");
//        try {
//            FileReader reader = new FileReader((input));
//            BufferedReader bufferR = new BufferedReader(reader);
//            String line = bufferR.readLine();
//            while(line != null){
//                System.out.println(line);
//                line = bufferR.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    public static void main(String[] args) throws Exception{
//        File input = new File("output.txt");
//
//        FileReader reader = new FileReader((input));
//        BufferedReader bufferR = new BufferedReader(reader);
//        String line = bufferR.readLine();
//        while(line != null){
//            System.out.println(line);
//            line = bufferR.readLine();
//        }
//    }

    public static void main(String[] args) throws Exception {
        File input = new File("output.txt");

        FileReader reader = new FileReader((input));
        BufferedReader bufferR = new BufferedReader(reader);
        String line;
        do {
            line = bufferR.readLine();
            if(line == null){
                break;
            }
            System.out.println(line);

        } while (line != null);
    }

}
