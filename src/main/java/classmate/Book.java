package classmate;

public class Book {
    private String name;
    private String author;
    private int price;

    public void dob(){
        int day, month,year;
    }
    Book(){

    }
    Book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPrice(){
        return this.price =price;
    }
    public void setPrice(int price){
        this.price = price;
    }

}
