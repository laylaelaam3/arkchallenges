package ma.arkAcademy.week2.InterfaceAbstraction.Geometric;

public abstract class Shape implements Drawable{
    @Override
    public abstract void drawShape();
    // Method to display the type of shape
    public abstract void displayShapeType();

}
