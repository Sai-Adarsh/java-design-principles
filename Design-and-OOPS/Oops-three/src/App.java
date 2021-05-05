import java.util.*;
public class App {
    HashMap <String, String> newMap = new HashMap <String, String>();
    public static void main(String[] args) throws Exception {
        System.out.println("Output!");
        Inheritance newObj = new Inheritance();
        App Obj = new App();
        Obj.newMap = newObj.main();
        System.out.println(Obj.newMap);
    }
}