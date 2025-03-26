public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Мосян", "Тунсю");
        Book book1 = new Book("Гарри Поттер", author1, 2001);
        Book book2 = new Book("Благословение небожителей", author2, 1994);
        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", год публикации " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", год публикации " + book2.getPublicationYear());
        book1.setPublicationYear(1999);
        System.out.println("Изменённый год публикации для книги " + book1.getTitle() + ": " + book1.getPublicationYear());
    }
}
