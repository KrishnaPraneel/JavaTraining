package filehandling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingTypeEx2 {
    public static void main(String[] args){
        File f1 = new File("/Users/krishnapeddibhotla/Desktop/JaTra.txt");
        try{
            f1.createNewFile();
            FileWriter fw = new FileWriter(f1);
            fw.write("This is an easy way to create and read the file");
            fw.close();
            FileReader fr = new FileReader(f1);
            int a;
            while((a = fr.read())!= -1){
                System.out.println((char)a);
            }
        }catch (IOException e){

        }
    }
}
