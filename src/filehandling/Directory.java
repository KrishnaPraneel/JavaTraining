package filehandling;

import java.io.File;

public class Directory {
    public static void main(String[] args){
        try{
            File f = new File("/Users/krishnapeddibhotla/Desktop/");
           /* if(f.exists()){
                System.out.println("Directory exists");
            } else {
                f.mkdir();
            }*/
            String[] stringArray = f.list();
            for(int i=0; i<stringArray.length; i++){
                System.out.println(stringArray[i]);
            }
        }catch(Exception e){

            System.out.println("Execption");
        }
    }
}
