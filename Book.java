package Lab2;
import java.lang.*;
public class Book {
    private String name;
    private String author;
    private int pages;
    private int basePrice;

    public Book(String name, String author, int pages, int basePrice) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setBasePrice(int basePrice){
    this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", basePrice=" + basePrice +
                '}';
    }

    public void getprice(){
        System.out.println(" Название книги: "+name+" Автор: "+author+" Количество страниц: "+pages+" Цена: "+basePrice+"");
    }
}


