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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return name != null ? name.equals(book.name) : book.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return author.toString() +
                ", Название: " + name +
                ", Год публикации: " + yearPublishing;
    }
}