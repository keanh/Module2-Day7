public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100,50,"red",false);
        Square square= new Square(10,"blue",false);
        Shape[] shapes = {rectangle,square};

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
        for (Shape shape:shapes){
            shape.howToColor();
        }
    }
}
