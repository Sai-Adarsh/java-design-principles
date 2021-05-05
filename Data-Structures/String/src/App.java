public class App {
    String newStr = "Hello world";
    public static void main(String[] args) {
        App Obj = new App();
        System.out.println(Obj.newStr);
        printString();
        printChar();
    }

    public static void printString() {
        App Obj = new App();
        for (int i = 0; i < Obj.newStr.length(); i++) {
            System.out.println(Obj.newStr.charAt(i));
        }
    }

    public static void printChar() {
        App Obj = new App();
        for (char c: Obj.newStr.toCharArray()) {
            System.out.println(c);
        }
    }
}