import java.util.*;

public class App {
    ArrayList<Integer> q = new ArrayList<Integer>();
    public static void main(String[] args) throws Exception {
        App Obj = new App();
        System.out.println(QueueIsEmpty(Obj));
        QueueEnqueue(Obj, 10);
        System.out.println(QueueIsEmpty(Obj));
        QueueEnqueue(Obj, 30);
        System.out.println(QueueIsEmpty(Obj));
        QueueDequeueLeft(Obj);
        System.out.println(QueueIsEmpty(Obj));
        QueueDequeueRight(Obj);
    }

    public static boolean QueueIsEmpty(App Obj) {
        if (Obj.q.size() <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void QueueEnqueue(App Obj, int num) {
        Obj.q.add(num);
        System.out.println(Obj.q);
    }

    public static void QueueDequeueLeft(App Obj) {
        if (Obj.q.size() >= 1) {
            Obj.q.remove(0);
        }
        System.out.println(Obj.q);
    }

    public static void QueueDequeueRight(App Obj) {
        if (Obj.q.size() >= 1) {
            Obj.q.remove(Obj.q.size() - 1);
        }
        System.out.println(Obj.q);
    }
}