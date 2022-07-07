package sample.com.atguigu.spring5;

public class Book {
    public Book(String bname) {
        this.bname = bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBname() {
        return bname;
    }

    public Book() {
    }

    private String bname;

}
