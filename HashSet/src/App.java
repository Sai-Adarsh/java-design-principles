import java.util.*;
public class App {
    HashSet <Integer> visited = new HashSet <Integer>(5);
    public static void main(String[] args) throws Exception {
        App Obj = new App();
        for (int i = 0; i < 5; i++) {
            Obj.visited.add(1);
        }
        System.out.println(Obj.visited.contains(1));
        System.out.println(Obj.visited.contains(3));

        Obj.visited.remove(1);
        Obj.visited.clear();
    }
}
