package Day33;

import java.util.concurrent.Callable;

public class CircleClass {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(3.5);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
    }
}
