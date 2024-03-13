package exceptions;

public class ExceptionsExample2 {
  public static void main(String[] args){
      try {
          String k = "Krishna";
          System.out.println(k.charAt(10));
      } catch (StringIndexOutOfBoundsException e){
          System.out.println("Code Executed");
      }
      try {
          String p = "Praneel";
          System.out.println(p.charAt(10));
      } catch (StringIndexOutOfBoundsException f){
          System.out.println("Both the codes are exceuted");
      }
  }
}
