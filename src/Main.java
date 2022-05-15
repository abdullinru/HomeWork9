
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
        System.out.println("");
        String stroka = "aabccddefgghiijjkk";
        validator(stroka);

        System.out.println("");
        int[] arr = generateRandomArray();
        System.out.println("Среднее значение = " + srednee(arr));


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
    public static double srednee(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (sum * 1.0 / arr.length) ;

    }
}