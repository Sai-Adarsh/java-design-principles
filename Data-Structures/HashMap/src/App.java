import java.util.*;
public class App {
    HashMap <Integer, String> url_map = new HashMap <Integer, String>(10);
    public static void main(String[] args) {
        App Obj = new App();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Obj.url_map.put(rand.nextInt(9999 - 1000 + 1) + 1000, "World");
        }

        Obj.url_map.put(1000, "D.E. Shaw");

        for (Integer c: Obj.url_map.keySet()) {
            System.out.println(c);
            System.out.println(Obj.url_map.get(c));
        }

        Obj.url_map.put(1000, "Cisco");
        Obj.url_map.put(2000, "Ajira");
        for (Integer c: Obj.url_map.keySet()) {
            System.out.println(c);
            System.out.println(Obj.url_map.get(c));
        }

        Obj.url_map.remove(2000);
        Obj.url_map.clear();

    }
}