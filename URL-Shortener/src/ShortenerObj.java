import java.util.HashMap;
import java.util.Random;

public class ShortenerObj {
    public HashMap<Integer, String> shortener(String url, HashMap<Integer, String> url_map) {
        System.out.println("Obj works");
        Random rand = new Random();
        int temp = rand.nextInt(9999 - 1000 + 1) + 1000;
        url_map.put(temp, url);
        return url_map;
    }    
}
