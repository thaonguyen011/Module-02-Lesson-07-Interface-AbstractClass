package Interface_Resizeable.Inheritance_Shape;

import Interface_Resizeable.Colorable;
import Interface_Resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable,Colorable {
    private double side = 1.0;
    Square() {
        setWidth(1.0);
        setHeight(1.0);
        side = 1.0;
    }
    Square(double side) {
        setWidth(side);
        setHeight(side);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
        this.side = side;
    }

    @Override
    public double getHeight() {
        return this.side;
    }

    public double getWidth() {
        return this.side;

    }

    public void setWidth(double side) {
        super.setWidth(side);
        this.setSide(side);
    }

    public void setHeight(double side) {
        super.setHeight(side);
        setSide(side);
    }
    public String toString() {
        return "A Square with side=" + side + ", which is a sub class of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * percent);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
