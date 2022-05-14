
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Lev","Tolstoy");
        Author author2 = new Author("Evgeniy", "Onegin");
        Book book1 = new Book(author1, "Voina i mir", 1979);
        Book book2 = new Book(author2, "gore ot uma", 2000);
        book1.setYearPublishing(2005);


    }
}