package Lab2;
import java.lang.*;
public class TextBook {
    public static void main(String[] args){
        Book d1 = new Book(" Мастер и Маргарита ", " М.Булгаков", 480, 650 );
        Book d2 = new Book(" Идиот", " Ф.Достоевский", 672, 500 );
        Book d3 = new Book(" Война и мир ", " Л.Толстой", 1300, 900 );
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();

    }
}
