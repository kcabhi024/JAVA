public class Book {

    static  int totalNumberOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNumberOfBooks =0;
    }
    {
        // object initialization
        totalNumberOfBooks++;
    }
    Book(String isbn, String author,String title){
        this.author =author;
        this.isbn =isbn;
        this.title =title;
    }
    Book(String isbn){
        this(isbn,"unknown","unknown");
    }

    static  int getTotalNumberOfBooks(){

        return totalNumberOfBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is Borrowed");
        }
        else {
            this.isBorrowed = true;
            System.out.println("enjoy the book");
        }

    }
    void returnBook(){
        if (isBorrowed){
            this.isBorrowed =false;
            System.out.println("Hope you enjoy the book !.. thank you...");
        }
        else {
            System.out.println("This book is already in the library.");
        }
    }

    public static void main(String[] args) {
        Book designOfBooks = new Book("11","java.com","java");
        Book designBooks = new Book("111","mr hardly","c++");
        Book boo1 =new Book("1");
        System.out.println(Book.getTotalNumberOfBooks());
        designOfBooks.borrowBook();
        boo1.borrowBook();
        boo1.borrowBook(); // to check the book is borrowed or not
        designBooks.borrowBook();
        designOfBooks.returnBook();
        designOfBooks.returnBook(); // to check the book is returned twice or not
    }
}
