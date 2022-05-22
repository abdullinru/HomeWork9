public class Library {
    private Book[] bibl;

    public Library (int dlinaMassiva) {
        this.bibl = new Book[dlinaMassiva];
    }

    public void addBook(Book kniga) {
        for (int i = 0; i < bibl.length; i++) {
            if (bibl[i] == null) {
                bibl[i] = kniga;
                break;
            }
        }
    }

    public void print () {
        int i = 0;
        while (bibl[i] != null) {
            System.out.println(bibl[i].getAuthor().getName() + " " + bibl[i].getAuthor().getFamiliya() + ": " + bibl[i].getName() + ": " + bibl[i].getYear() );
            i++;
        }
        System.out.println();
    }

    public void infoBook (String nameBook) {
        int i = 0;
        while (bibl[i] != null) {
            if (bibl[i].getName().equals(nameBook)) {
                System.out.println("The Stand by " + bibl[i].getAuthor().getName() + " " + bibl[i].getAuthor().getFamiliya() + " was published in " + bibl[i].getYear());
                break;
            }
            i++;
        }
    }
    public void changeBookYearPublish (String nameBook, int year) {
        for (int i = 0; i < bibl.length; i++) {
            if (bibl[i].getName().equals(nameBook)) {
                bibl[i].setYearPublishing(year);
                break;
            }
        }
    }

}
