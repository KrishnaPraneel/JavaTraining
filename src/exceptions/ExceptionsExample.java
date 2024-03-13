package exceptions;

import java.util.List;
import java.lang.Object;
import java.io.File;

public class ExceptionsExample {
    public static void main(String[] args){

        try {
            String s = "Praneel";
           System.out.println(s.charAt(8));
            int a[] = new int[2];
            System.out.println(a[3]);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException p){
            System.out.println("ArrayException");
        } catch (Exception e){
            System.out.println("inheritance.Parent Exception");
        }
        System.out.println("Program executed");
    }
}
