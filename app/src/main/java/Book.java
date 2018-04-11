/**
 * Created by Matthew Williams on 11/4/18.
 */

public class Book {
    // Declare all Book variables
    private String mTitle;
    private int mISBN;
    private String mAuthor;
    private String mPublisher;
    private int mEdition;
    private int mYearPub;
    private String mGenre;
    private String mBookDesc;

    // Default Book constructor
    public Book(){
        this.mTitle = "Book Title";
        this.mISBN = 00000000;
        this.mAuthor = "John Doe";
        this.mPublisher = "Publisher";
        this.mEdition = 1;
        this.mYearPub = 2000;
        this.mGenre = "None";
        this.mBookDesc = "This is a book";

    }

    // Specific Book constructor
    public Book(String title, int ISBN, String author, String publisher, int edition,
                int yearPub, String genre, String bookDesc){
        this.mTitle = title;
        this.mISBN = ISBN;
        this.mAuthor = author;
        this.mPublisher = publisher;
        this.mEdition = edition;
        this.mYearPub = yearPub;
        this.mGenre = genre;
        this.mBookDesc = bookDesc;
    }

    // Summarise Book
    public String getSummary(){
        return "Title: " + this.mTitle + ", ISBN: " + this.mISBN +
                ", Author: " + this.mAuthor + ", Publisher: " + this.mPublisher +
                ", Edition: " + this.mEdition + ", Year of Publication: " + this.mYearPub +
                ", Genre: " + this.mGenre + ", Book Description: " + this.mBookDesc;
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

    // Set publisher
    public void setPublisher(String publisher){
        this.mPublisher = publisher;
    }

    // Set edition
    public void setEdition(int edition){
        this.mEdition = edition;
    }

    // Set year of publication
    public void setYearPub(int yearPub){
        this.mYearPub = yearPub;
    }

    // Set genre
    public void setGenre(String genre){
        this.mGenre = genre;
    }

    // Set Book description
    public void setBookDesc(String bookDesc){
        this.mBookDesc = bookDesc;
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

    // Retrieve Publisher
    public String getPublisher(){
        return this.mPublisher;
    }

    // Retrieve edition
    public int getEdition(){
        return this.mEdition;
    }

    // Retrieve year of publication
    public int getYearPub(){
        return this.mYearPub;
    }

    // Retrieve genre
    public String getGenre(){
        return this.mGenre;
    }

    // Retrieve Book description
    public String getBookDesc() { return this.mBookDesc; }
}
