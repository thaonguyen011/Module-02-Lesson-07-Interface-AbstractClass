package Interface_Resizeable.Inheritance_Shape;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Shape shape = new Shape();
       Shape circle = new Circle();
       Shape rectangle = new Rectangle();
       Shape square1 = new Square();
       Rectangle square2= new Square();
       Square square3 = new Square();


       System.out.println(shape);
       System.out.println(circle);
       System.out.println(rectangle);
       System.out.println(square1);//variable type = Shape;
       System.out.println(square2);// variable type = Rectangle;
       System.out.println(square3);// variable type = Square;

       Square square4 = new Square();
       square4.resize(0.5);
       square4.howToColor();

       System.out.println(square4.getSide());

    }
}