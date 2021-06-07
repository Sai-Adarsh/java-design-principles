abstract class SecondClass {
    public void someFunc() {
        System.out.println("Second class");
    }
    abstract void sameFunc();
}

public class App extends SecondClass{

    void sameFunc() {
        System.out.println("Abstract func");
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App Obj = new App();
        Obj.sameFunc();
    }

}