public class App {

    public int one = 10;
    public int two = 10;

    void duplicateInt(int one, int two){
        System.out.println(one);
        System.out.println(two);
        System.out.println(this.one);
        System.out.println(this.two);
    }

    public static void main(String[] args) throws Exception {
        App Obj = new App();
        Obj.duplicateInt(20, 20);
    }
}
