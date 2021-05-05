import java.util.*;

public class App {
    ArrayList<Integer> stack = new ArrayList<Integer>();
    public static void main(String[] args) throws Exception {
        App Obj = new App();
        System.out.println(StackIsEmpty(Obj));
        StackPush(Obj, 10);
        System.out.println(StackIsEmpty(Obj));
        StackPush(Obj, 10);
        System.out.println(StackIsEmpty(Obj));
        StackPop(Obj);
        System.out.println(StackIsEmpty(Obj));
        StackPop(Obj);
        System.out.println(StackIsEmpty(Obj));
    }

    public static boolean StackIsEmpty(App Obj) {
        if (Obj.stack.size() <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void StackPush(App Obj, int num) {
        Obj.stack.add(num);
        System.out.println(Obj.stack);
    }

    public static void StackPop(App Obj) {
        if (Obj.stack.size() > 0) {
            Obj.stack.remove(Obj.stack.size() - 1);
        }
        System.out.println(Obj.stack);
    }
}