import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        if (author == null) {
            throw new IllegalArgumentException("Автор не может быть null");
        }
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Книга: " + title + ", Автор: " + author.toString() + ", год публикации: " + publicationYear;
    }

    public boolean equals(Object auth) {
        if (this == auth) return true;
        if (auth == null || getClass() != auth.getClass()) return false;
        Book book = (Book) auth;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(title, publicationYear);
    }
}
