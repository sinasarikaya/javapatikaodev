package java102patika;

import java.util.*;


class Book implements Comparable<Book>{
    private String name;
    private int pageNum;
    private String writerName;
    private String releaseDate;

    public Book(String name, int pageNum, String writerName, String releaseDate) {
        this.name=name;
        this.pageNum=pageNum;
        this.writerName=writerName;
        this.releaseDate=releaseDate;

    }

    @Override
    public String toString() {
        String ret="";
        ret += "Kitap ismi: " + this.name + "\n";
        ret += "Sayfa Sayisi: " + this.pageNum + "\n";
        ret += "Yazarin ismi: " + this.writerName + "\n";
        ret += "Yayın Tarihi: " + this.releaseDate + "\n";
        return ret;
    }

    @Override
    public int compareTo(Book b) {

        return this.getName().compareTo(b.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public static void main(String[] args) {



    }

}

class Main{
    public static void main(String[] args) {
        Book book1 = new Book("A", 100, "Yazar 1", "1990");
        Book book2 = new Book("C", 150, "Yazar 2", "2000");
        Book book3 = new Book("B", 200, "Yazar 3", "2005");
        Book book4 = new Book("E", 175, "Yazar 4", "2020");
        Book book5 = new Book("D", 75, "Yazar 5", "1985");

        Set<Book> books = new TreeSet<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        books.forEach(book -> System.out.println(book));

        System.out.println("\n===============================================\n");

        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }
        });

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        books2.forEach(book -> System.out.println(book));
    }}

