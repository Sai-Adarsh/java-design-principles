public class App {
    int[] arr = new int[100];
    public static void main(String[] args) {
        App Obj = new App();
        Obj.arr = changeArr(Obj);
    }

    public static int[] changeArr(App Obj){
        for (int i = 0; i < Obj.arr.length; i++) {
            Obj.arr[i] = i + 1;
            System.out.println(Obj.arr[i]);
        }
        return Obj.arr;
    }
}