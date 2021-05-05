import java.util.*;

public class App extends ShortenerObj{
    public static void main(String[] args) throws Exception {
        urlShortener();
    }

    public static void urlShortener() {
        ShortenerObj newObj = new ShortenerObj();
        HashMap <Integer, String> url_map = new HashMap <Integer, String>();
        String url = "https://github.com/jsquared21/Intro-to-Java-Programming";
        System.out.println(url_map);
        url_map = newObj.shortener(url, url_map);
        System.out.println(url_map);
    }

}
