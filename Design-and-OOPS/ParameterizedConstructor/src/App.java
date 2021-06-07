class SecondClass {
    private int one;
    SecondClass(int one) {
        this.one = one;
    }

    int getOne() {
        return this.one;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        SecondClass Obj = new SecondClass(10);
        System.out.println(Obj.getOne());
    }
}
