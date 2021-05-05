public class App {
    private static App Obj = new App();
    App () {};

    public static App getInstance() {
        return Obj;
    }

    public void showMessage() {
        System.out.println("Singleton works");
    }
}