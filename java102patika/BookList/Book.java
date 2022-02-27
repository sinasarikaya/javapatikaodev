package java102patika.BookList;

import java.util.Comparator;

public class Book  {
    private String bookName;
    private int pageNum;
    private String writerName;
    private String releaseDate;


    public Book(String bookName, int pageNum, String writerName, String releaseDate) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.writerName = writerName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
