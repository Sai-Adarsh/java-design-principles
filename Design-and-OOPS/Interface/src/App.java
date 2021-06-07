public class App implements Factory {

    public static void main(String[] args) throws Exception {
        App Obj = new App();
        Obj.shapeArea("Hello, world!");
    }

    @Override
    public void shapeArea(String s) {
        // TODO Auto-generated method stub
        System.out.println(s);
    }
}