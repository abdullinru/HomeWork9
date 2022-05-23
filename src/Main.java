
public class Main {
    public static void main(String[] args) {

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);
        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);

    }

    private static void addBook(Book[]bibl, Book kniga) {
        for (int i = 0; i < bibl.length; i++) {
            if (bibl[i] == null) {
                bibl[i] = kniga;
                break;
            }
        }

    }

    private static void printBook (Book[] bibl) {
        int i = 0;
        while (bibl[i] != null) {
            System.out.println(bibl[i].getAuthor().getName() + " " + bibl[i].getAuthor().getFamiliya() + ": " + bibl[i].getName() + ": " + bibl[i].getYear() );
            i++;
        }
        System.out.println();

    }
    private static void revers (char[] str) {
        for (int i = 0; i < str.length/2; i++) {
            char simbol = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = simbol;
        }

    }
    private static void validator (String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                System.out.println("Найден дубль: " + str.charAt(i));
                break;
            }
        }
    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static double srednee(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (sum * 1.0 / arr.length) ;

    }
}