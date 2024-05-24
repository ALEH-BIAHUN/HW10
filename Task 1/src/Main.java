import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int priceBook = inputPriceBook();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, priceBook);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }
    public static int inputPriceBook() {
        System.out.println("Введите стоимость книги:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName, pageCount, 0);
    }
    public static void addBook(String bookName, int pageCount, int priceBook) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.," +
                (priceBook > 0 ? priceBook : "N/A") + " руб.\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }
}