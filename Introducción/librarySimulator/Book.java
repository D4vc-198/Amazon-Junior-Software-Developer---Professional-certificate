public class Book {
    String title;
    String author;
    String category;
    int publishYear;

    public String getBookDetails() {
        return "Title: " + title + "\nAuthor: " + author + "\nCategory: " + category + "\nPublis Year: " + publishYear;
    }

}
