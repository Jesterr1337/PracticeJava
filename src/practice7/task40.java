package practice7;

public class task40 {
    private BookItem[] books;
    private int size;

    public task40(int capacity) {
        this.books = new BookItem[capacity];
        this.size = 0;
    }

    public void addBook(BookItem book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Фонд заповнений, книгу не додано");
        }
    }

    public BookItem findBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String title) {
        BookItem book = findBookByTitle(title);
        if (book == null) {
            System.out.println("Книги \"" + title + "\" немає у фонді");
            return false;
        }
        if (!book.isAvailable()) {
            System.out.println("Книга \"" + title + "\" уже видана");
            return false;
        }
        book.borrowBook();
        System.out.println("Книгу \"" + title + "\" видано");
        return true;
    }

    public void printCatalog() {
        System.out.println("--- Каталог бібліотеки ---");
        for (int i = 0; i < size; i++) {
            books[i].printBook();
        }
    }

    public static void main(String[] args) {
        task40 lib = new task40(5);
        lib.addBook(new BookItem("111", "Кобзар", "Тарас Шевченко"));
        lib.addBook(new BookItem("222", "Intermezzo", "Михайло Коцюбинський"));
        lib.addBook(new BookItem("333", "Лісова пісня", "Леся Українка"));

        lib.printCatalog();
        lib.borrowBook("Кобзар");
        lib.printCatalog();
        lib.borrowBook("Кобзар");
        lib.borrowBook("Невідома книга");
    }

    static class BookItem {
        private String isbn;
        private String title;
        private String author;
        private boolean isAvailable;

        public BookItem(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public String getTitle() {
            return title;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void borrowBook() {
            isAvailable = false;
        }

        public void returnBook() {
            isAvailable = true;
        }

        public void printBook() {
            System.out.println("[" + isbn + "] \"" + title + "\" - " + author + " (" + (isAvailable ? "доступна" : "видана") + ")");
        }
    }
}
