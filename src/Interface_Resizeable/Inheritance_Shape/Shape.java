package Interface_Resizeable.Inheritance_Shape;
public class Shape {
    private String color = "green";
    private boolean filled = true;

    Shape() {}
    Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() { return color;}
    public boolean getFilled() { return filled;}
    public void setColor(String c) { color = c;}
    public void setFilled(boolean f) { filled = f;}

    public String toString(){
        return "A Shape with color of " + color + " and " + (filled ? "filled" : " not filled");
    }
}
