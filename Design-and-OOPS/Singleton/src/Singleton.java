public class Singleton {

    public static void main(String[] args) throws Exception {
        App Obj = App.getInstance();   
        Obj.showMessage();
    }
}