public class Author {
    String name;
    String familiya;
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

        if (name != null ? !name.equals(author.name) : author.name != null) return false;
        return familiya != null ? familiya.equals(author.familiya) : author.familiya == null;
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