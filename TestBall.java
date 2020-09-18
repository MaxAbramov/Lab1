package Lab3;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(40, 60);
        Ball b2 = new Ball(110, 80);
        Ball b3 = new Ball(140, 60);
        Ball b4 = new Ball(120, 100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(10, 30);
        b2.move(20, 40);
        b3.move(30, 50);
        b4.move(40, 60);
    }
}
