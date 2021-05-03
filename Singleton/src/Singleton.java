public class Singleton {
    private static final Singleton Obj = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return Obj;
    }

    public void display() {
        System.out.println("Singleton Eager Init");
    }
}
