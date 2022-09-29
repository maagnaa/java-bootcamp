import java.net.MalformedURLException;
import java.net.URL;

public class ParseURLTwo {
    public static void main(String[] args) {
        String stringVariable = "Hello from my String!";
        char char3 = stringVariable.charAt(3);

        try{
            parseURL("https://www.google.com/images");
        }catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void parseURL(String link) throws MalformedURLException {
            URL url = new URL(link);
            System.out.println("Protocol: \t"+url.getProtocol());
            System.out.println("Host: \t\t"+url.getHost());
            System.out.println("Path: \t\t"+url.getPath());
    }    
}
