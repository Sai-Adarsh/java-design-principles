class SecondClass {
    static int one = 0;
    int two = 0;
}

public class App {
    public static void main(String[] args) throws Exception {
        SecondClass.one += 1;
        SecondClass.one += 1;
        SecondClass Obj = new SecondClass();
        SecondClass ObjTwo = new SecondClass();
        Obj.two += 1;
        ObjTwo.two += 1;
        System.out.println(SecondClass.one);
        System.out.println(Obj.two);
        System.out.println(ObjTwo.two);
    }
}