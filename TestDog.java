package Lab1;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Doggy d1 = new Doggy("Рома", 2);
        Doggy d2 = new Doggy("Люцифер", 3);
        Doggy d3 = new Doggy ("Лёшик");
        d3.setAge(4);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
