import java.util.HashMap;

public class Inheritance extends App{
    public static HashMap <String, String> main() throws Exception {
        App Obj = new App();
        Obj.newMap.put("Hello", "World");
        return returnsObj(Obj);
    }

    public static HashMap <String, String> returnsObj(App Obj){
        return Obj.newMap;
    }
}
