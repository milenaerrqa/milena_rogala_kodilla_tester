public class Book {
    private String author;
    private String title;

    public static Book of(String a, String t){
        Book book = new Book();
        book.author = a;
        book.title = t;
        return book;
     }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.author + ", " + book.title);
    }
}

