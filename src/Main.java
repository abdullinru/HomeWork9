
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Lev","Tolstoy");
        Author author2 = new Author("Evgeniy", "Onegin");
        Book book1 = new Book(author1, "Voina i mir", 1979);
        Book book2 = new Book(author2, "gore ot uma", 2000);
        book1.setYearPublishing(2005);

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("");
        revers(reverseFullName);
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }



    }
    private static void revers (char[] str) {
        for (int i = 0; i < str.length/2; i++) {
            char simbol = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = simbol;
        }

    }
}