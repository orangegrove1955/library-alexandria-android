/**
 * Created by Matthew Williams on 11/4/18.
 */

public class Book {
    // Declare all Book variables
    private String mTitle;
    private int mISBN;
    private String mAuthor;

    // Default Book constructor
    public Book(){
        this.mTitle = "Book Title";
        this.mISBN = 00000000;
        this.mAuthor = "John Doe";

    }

    // Specific Book constructor
    public Book(String title, int ISBN, String author){
        this.mTitle = title;
        this.mISBN = ISBN;
        this.mAuthor = author;
    }

    // Summarise Book
    public String getSummary(){
        return "Title: " + this.mTitle + ", ISBN: " + this.mISBN +
                ", Author: " + this.mAuthor;
    }

    // Setter Methods
    // --------------

    // Set Title
    public void setTitle(String title){
        this.mTitle = title;
    }

    // Set ISBN
    public void setISBN(int ISBN){
        this.mISBN = ISBN;
    }

    // Set author
    public void setAuthor(String author){
        this.mAuthor = author;
    }

    // Getter methods
    // --------------

    // Retrieve title
    public String getTitle(){
        return this.mTitle;
    }

    // Retrieve ISBN
    public int getISBN(){
        return this.mISBN;
    }

    // Retrieve Author
    public String getAuthor(){
        return this.mAuthor;
    }
}
