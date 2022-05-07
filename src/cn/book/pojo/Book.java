package cn.book.pojo;

public class Book {
    private String book_id;
    private String book_name;
    private String book_type;
    private int book_num;
    private double book_price;
    private int book_lend;
    private String book_ISBN;
    private String book_address;
    private String book_business;
    private String book_author;
    private String book_edition;
    private int book_times;

    public Book(){}

    public Book(String book_id, String book_name, String book_type, int book_num, double book_price, int book_lend, String book_ISBN, String book_address, String book_business, String book_author, String book_edition, int book_times) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_type = book_type;
        this.book_num = book_num;
        this.book_price = book_price;
        this.book_lend = book_lend;
        this.book_ISBN = book_ISBN;
        this.book_address = book_address;
        this.book_business = book_business;
        this.book_author = book_author;
        this.book_edition = book_edition;
        this.book_times = book_times;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

    public int getBook_num() {
        return book_num;
    }

    public void setBook_num(int book_num) {
        this.book_num = book_num;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public int getBook_lend() {
        return book_lend;
    }

    public void setBook_lend(int book_lend) {
        this.book_lend = book_lend;
    }

    public String getBook_ISBN() {
        return book_ISBN;
    }

    public void setBook_ISBN(String book_ISBN) {
        this.book_ISBN = book_ISBN;
    }

    public String getBook_address() {
        return book_address;
    }

    public void setBook_address(String book_address) {
        this.book_address = book_address;
    }

    public String getBook_business() {
        return book_business;
    }

    public void setBook_business(String book_business) {
        this.book_business = book_business;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_edition() {
        return book_edition;
    }

    public void setBook_edition(String book_edition) {
        this.book_edition = book_edition;
    }

    public int getBook_times() {
        return book_times;
    }

    public void setBook_times(int book_times) {
        this.book_times = book_times;
    }
}
