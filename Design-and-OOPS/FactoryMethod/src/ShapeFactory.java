public class ShapeFactory {

    public Shape getInstance(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType == "Square") {
            Square square = new Square();
            return square;
        }
        return null;
    }
}