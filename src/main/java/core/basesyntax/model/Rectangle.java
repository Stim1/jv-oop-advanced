package core.basesyntax.model;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", square: " + getArea() + " sq.units, color: "
                + getColor() + ", width: " + width
                + ", length: " + length);
    }
}
