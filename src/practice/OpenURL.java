package practice;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;




public class OpenURL {
    public static void main(String[] args){
        if (Desktop.isDesktopSupported()){
            Desktop desktop = java.awt.Desktop.getDesktop();
            try {
                URI uri = new URI("https://www.google.com/?client=safari");
                desktop.browse(uri);
            }catch (IOException e){
                e.printStackTrace();
            }catch (URISyntaxException f){
                f.printStackTrace();
            }
        }
    }
}
