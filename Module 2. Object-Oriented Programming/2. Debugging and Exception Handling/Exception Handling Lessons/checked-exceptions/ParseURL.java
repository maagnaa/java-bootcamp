import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/images");
            System.out.println("Protocol: \t"+url.getProtocol());
            System.out.println("Host: \t\t"+url.getHost());
            System.out.println("Path: \t\t"+url.getPath());
        }catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }
}
