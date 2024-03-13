package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args){
        File f1 = new File("/Users/krishnapeddibhotla/Desktop/javatraining.txt");
        try {
            f1.createNewFile();
            FileWriter fw = new FileWriter(f1);
            fw.write("second way to create a file");
            fw.close();
            FileReader fr = new FileReader(f1);
            int a;
            while((a=fr.read())!= -1){
                System.out.print((char)a);
            }
        } catch (IOException e){
        }
    }
}
