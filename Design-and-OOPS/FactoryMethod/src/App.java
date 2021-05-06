public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getInstance("Square");
        shape.draw();
    }
}