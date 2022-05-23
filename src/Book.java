import java.util.Objects;

public class Book {
    private Author author;
    private String  name;
    private int yearPublishing;

    public Book (String name, Author author, int yearPublishing) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(author, book.getAuthor())&&
                Objects.equals(name, book.getName())&&
                Objects.equals(yearPublishing, book.getYear());
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name + " by " +
                author.toString() +
                "; Год публикации: " + yearPublishing;
    }
}