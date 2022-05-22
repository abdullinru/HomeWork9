import java.util.Objects;

public class Author {
    private String name;
    private String familiya;
    public Author (String name, String familiya) {
        this.name = name;
        this.familiya = familiya;
    }

    public String getName() {
        return name;
    }

    public String getFamiliya() {
        return familiya;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;
        return Objects.equals(name, author.getName())&&Objects.equals(familiya, author.getFamiliya());


    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (familiya != null ? familiya.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Фамилия: " + familiya;
    }
}