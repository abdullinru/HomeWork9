public class Book {
    Author author;
    String  name;
    int yearPublishing;

    public Book (Author author, String name, int yearPublishing) {
        this.author = author;
        this.name = name;
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}