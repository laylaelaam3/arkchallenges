package ma.arkAcademy.week2.day7.Geometric;

public class Main {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        Triangle triangle = new Triangle();
        Square square = new Square();
        drawingBoard.addShape(triangle);
        drawingBoard.addShape(square);
        drawingBoard.displayAndDrawShapes();
    }
}
