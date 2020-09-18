package Lab1;
import java.lang.*;
public class Doggy {
    private String name;
    private int age;

    public Doggy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Doggy(String n){
        name = n;
        age = 0;
    }
    public Doggy(){
        name = "doggy";
        age = 0;
    }

    public void setAge (int age) {this.age = age;}

    public void setName(String name){this.name = name;}

    public String getName (String name){return name;}

    public int getAge() {return age;}

    @Override
    public String toString() {
        return "Doggy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void intoHumanAge() {

        System.out.println(name+ " Возвраст в человеческих годах " +age*7+ " лет");
    }
}
