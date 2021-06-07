class SecondClass {
    int one, two;

    SecondClass(int one, int two) {
        this.one = one;
        this.two = two;
    }

    SecondClass(SecondClass Obj) {
        this.one = Obj.one;
        this.two = Obj.two;
    }

    public int area(){
        return this.one * this.two;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        SecondClass ObjOne = new SecondClass(10, 20);
        SecondClass ObjTwo = new SecondClass(ObjOne);
        System.out.println(ObjOne.area());
        System.out.println(ObjTwo.area());
    }
}
