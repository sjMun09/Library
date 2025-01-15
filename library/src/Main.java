public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book bookA = new Book("책 A", "저자 A", false);
        Book bookB = new Book("책 B", "저자 B", false);
        Book bookC = new Book("책 C", "저자 C", false);
        Book bookD = new Book("책 D", "저자 D", false);

        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        library.removeBook("책 C");
        library.listAllBook();
        library.borrowBook("첵 A");
        library.returnBook("책 A");
    }
}
