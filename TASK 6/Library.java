public class Library {
    private String libName;
    private int cap;
    
    public Library(String libName, int cap) {
        this.libName = libName;
        this.cap = cap;
    }
    public static class Book {
        private String title;
        public Book(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
    }
    public class Shelf {
        private String section;
        public Shelf(String section) {
            this.section = section;
        }
        public String describe() {
            return String.format("Shelf section: %s | In library: %s | Capacity: %d", section, libName, cap);
        }
    }
    public String getInfo() {
        return String.format("Library: %s | Capacity: %d", libName, cap);
    }


    public static void main(String[] args) {
        Library lib1 = new Library("City Library", 150);
        Book book1 = new Book("Affinity: Chaos");
        Shelf shelf = lib1.new Shelf("Adventure");
        Searchable searcher = new Searchable() {
            @Override
            public void search(String query) {
                System.out.printf("Searching for: %s", query);
            }
        };

        System.out.println(book1.getTitle());
        System.out.println(shelf.describe());
        System.out.println(lib1.getInfo());
        searcher.search("your query");
    }
}

interface Searchable {
    void search(String query);
}