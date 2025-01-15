import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    /*
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
     */
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
        System.out.println(title + "책이 삭제되었습니다.");
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) return book;
        }
        System.out.println(title + "의 책을 찾을 수 없습니다.");
        return null;
    }

    public void listAllBook() {
        if (books.isEmpty()) {
            System.out.println("놀랍게도, 도서관에 책이 없습니다.");
        } else {
            System.out.println("도서관의 책 조회");
            for (Book book : books) {
                book.infoBook();
            }
        }
    }

    public void borrowBook(String title) {
        Book book = searchBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(title + "책을 대여했습니다");
        } else if (book != null) {
            System.out.println(title + "책이 이미 대여 중입니다: ");
        }
//        else System.out.println("오류입니다. 직원을 찾아주세요");
    }

    public void returnBook(String title) {
        Book book = searchBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("책을 반납했습니다.");
        } else if (book != null) {
            System.out.println("이미 반납 했습니다.");
        }
//        else System.out.println("오류입니다. 직원을 찾아주세요");
    }

}
