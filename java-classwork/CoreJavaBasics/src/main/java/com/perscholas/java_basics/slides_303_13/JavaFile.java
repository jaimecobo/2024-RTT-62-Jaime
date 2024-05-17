package com.perscholas.java_basics.slides_303_13;

import java.io.File;
import java.io.IOException;

// .. means go up one directory from current directory
// . means the current directory

public class JavaFile {

    /* This is an example of how to declare a File
       is also an example of an absolute path, which starts from the HD */
    File file = new File("C:\\Users\\Jaime\\development\\...\\...\\newfile.txt");
//    C:\Users\jaime\development\2024-RTT-62\java-classwork\CoreJavaBasics\slides_303_13

    public static void main(String[] args) throws IOException {
        /* These are examples of relative paths, which are based on the current directory */
//        File f = new File(".");
        File f = new File("..");
//        File f = new File("..\\..\\");

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());


        File[] files = f.listFiles();
        for(File file : files){
            System.out.println("          " + file.getPath() + "             // This is the output of file.getPath() command");
            System.out.println("          " + file.getAbsolutePath() + "     // This is the output of file.getAbsolutePath() command");
            System.out.println("          " + file.getCanonicalPath() + "     // This is the output of file.getCanonicalPath() command");
            System.out.println("          " + file.getCanonicalFile() + "     // This is the output of file.getCanonicalFile() command");

            if(file.isDirectory()){
                System.out.println(file.getName() + " is a directory");
            }
            else{
                System.out.println(file.getName() + " is a file");
            }
        }

        try {
            File file01 = new File(".\\newfile.txt");
            file01.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }

    }

}
