public class Book {
    static int totalNoOfBooks;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    String title;
    String author;
    int isbn;
    boolean isBookBorrowed;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void borrowBook() {
        if (isBookBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBookBorrowed = true;
            System.out.println("Enjoy the Book");
            totalNoOfBooks--;
        }
    }

    public void returnBook() {
        if (isBookBorrowed) {
            this.isBookBorrowed = false;
            System.out.println("Book has been returned");
            totalNoOfBooks++;
        } else {
            System.out.println("Book is already returned");
        }
    }

    public static int getTotalBooks() {
        return totalNoOfBooks;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Math", "R.S. Agarwal", 123456);
        Book book2 = new Book("Physics", "H.C. Verma", 789012);
        Book book3 = new Book("Chemistry", "R.D. Sharma", 345678);
        book1.borrowBook();
        book2.borrowBook();
        book3.borrowBook();

        book1.returnBook();
        book2.returnBook();
        System.out.println(getTotalBooks());

    }
}
