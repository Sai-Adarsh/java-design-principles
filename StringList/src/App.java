public class App {
    String[] arr = new String[2];
    public static void main(String[] args) {
        App Obj = new App();
        Obj.arr = addElements(Obj);
    }

    public static String[] addElements(App Obj) {
        for (int i = 0; i < Obj.arr.length; i++) {
            Obj.arr[i] = "Hello";
            System.out.println(Obj.arr[i]);
        }
        return Obj.arr;
    }
    
}