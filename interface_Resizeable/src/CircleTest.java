public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle();
        circles[1] = new Circle("red",false,20);

        System.out.println("Before change radius:");
        for (Circle circle:circles){
            System.out.println(circle.getArea());
        }

        for (Circle circle:circles){
            Resizeable circle1 = (Circle) circle;
            circle1.resize(50);
        }

        System.out.println("After change radius");
        for (Circle circle:circles){
            System.out.println(circle.getArea());
        }
    }
}
