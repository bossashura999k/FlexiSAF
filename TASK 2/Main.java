import java.util.ArrayList;

public class Main {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book b) {
        books.add(b);
        System.out.println("Added: " + b.getTitle());
    }

    public static void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                System.out.println("Removed: " + books.get(i).getTitle());
                books.remove(i);
                return;
            }
        }
        System.out.println("Book not found.");
    }


}