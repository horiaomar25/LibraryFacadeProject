import facade.LibraryFacade;
import subsytem.*;

public class Program {
    public static void main(String[] args) {

        BookCatalogue bookCatalogue = new BookCatalogue();
        BorrowBook borrowBook = new BorrowBook();
        Membership membership = new Membership();
        ReturnBook returnBook = new ReturnBook();

        LibraryFacade librarian = new LibraryFacade(bookCatalogue, borrowBook, membership, returnBook);

       librarian.addBook(new Book("Harry Potter and The Goblet Of Fire", "JK Rowling"));
       librarian.addBook(new Book("The Bad Beginning", "Lemony Snicket"));
       librarian.addBook(new Book("Nineteen Eighty-Four", "George Orwell"));

       librarian.listAllBooks();

       librarian.addMembership(new Member("Alice", "1234"));














    }

}