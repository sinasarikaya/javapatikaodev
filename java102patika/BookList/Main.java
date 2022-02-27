package java102patika.BookList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Book b1=new Book("book1",90,"b1writer","1990");
        Book b2=new Book("book2",95,"b2writer","1995");
        Book b3=new Book("book3",120,"b3writer","2000");
        Book b4=new Book("book4",130,"b4writer","2005");
        Book b5=new Book("book5",140,"b5writer","2010");

        ArrayList<Book> books1=new ArrayList<>();

        books1.add(b1);
        books1.add(b2);
        books1.add(b3);
        books1.add(b4);
        books1.add(b5);

        Map<String,String> books2=new HashMap<>();

        books1.stream().forEach(book -> books2.put(book.getBookName(), book.getWriterName() ));

        System.out.println(books2);

        List<Book> books3=new ArrayList<>();

        books1.stream().filter(book -> book.getPageNum()>100).forEach(b-> books3.add(b));

        System.out.println(books3);



    }
}
