package filehandling;

import sun.misc.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandling {
    public static void main(String[] args){
        try {
            String y = "Krishna is living in USA";
            StringBuffer sb = new StringBuffer("i am in missorie");
            sb.append("\n");
            sb.append("i am staying in rolla");
            FileOutputStream x = new FileOutputStream("/Users/krishnapeddibhotla/Downloads/kp007.txt");
            x.write(y.getBytes());
            x.write("\n".getBytes());
            x.write(sb.toString().getBytes());
            InputStream is = new FileInputStream("/Users/krishnapeddibhotla/Downloads/kp007.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null){
               System.out.println(line);
                System.out.println(System.lineSeparator());
            }
        }catch (FileNotFoundException y){
            System.out.println("File not found exception");
        }catch (IOException i){
            System.out.println("IO Exception");
        }
    }
}
