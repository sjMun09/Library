public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    /**
     * 책 제목 조회
     */
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void infoBook() {
        String availability = isAvailable ? "대여가능" : "대여 중";
        System.out.println("제목 : "+ title);
        System.out.println("저자 : " + author);
        System.out.print("대여 가능 여부: " + availability+"\n");
    }

}
