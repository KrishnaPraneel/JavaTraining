package filehandling;

import java.io.*;

public class FileHandlingTypeEx1 {
    public static void main(String[] args){
        try {
            String x = "I am learning file handling type 1";
            StringBuffer sb = new StringBuffer("My basic.name is Krishna Praneel Peddibhotla");
            sb.append("\n");
            FileOutputStream fos = new FileOutputStream("/Users/krishnapeddibhotla/Desktop/JT.txt");
            fos.write(x.getBytes());
            fos.write("\n".getBytes());
            fos.write(sb.toString().getBytes());
            InputStream is = new FileInputStream("/Users/krishnapeddibhotla/Desktop/JT.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                System.out.println(System.lineSeparator());
            }
        } catch (FileNotFoundException y){
            System.out.println("File not found exception");
        }catch (IOException i){
            System.out.println("IO Exception");
        }
    }
}
