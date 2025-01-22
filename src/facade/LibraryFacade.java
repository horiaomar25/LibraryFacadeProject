package facade;

import subsytem.*;

public class LibraryFacade {

    // The objects of the subsystem declared here
    BookCatalogue bookCatalogue;
    BorrowBook borrowBook;
    Membership membership;
    ReturnBook returnBook;

    public LibraryFacade(BookCatalogue bookCatalogue, BorrowBook borrowBook, Membership membership, ReturnBook returnBook) {
        this.bookCatalogue = bookCatalogue;
        this.borrowBook = borrowBook;
        this.membership = membership;
        this.returnBook = returnBook;
    }

    // Book Catalogue

    public void listAllBooks(){
        bookCatalogue.listAllBooks();
    }
    public void addBook(Book book) {
        bookCatalogue.addBook(book);
    }

    public void searchBook(String title) {
        bookCatalogue.searchBook(title);
    }

    public void removeBook(String title) {
        bookCatalogue.removeBookFromCatalogue(title);
    }

    // BORROW BOOK
    public void borrowBook(String title, String libraryCardNumber) {

        if(membership.isMember(libraryCardNumber)){
            bookCatalogue.searchBook(title);
        }
    }

    public void borrowBookList(){
        borrowBook.getBorrowedBooks();
    }


    // Membership
    public void addMembership(Member member) {
        membership.addMember(member);
        System.out.println("Successfully added membership to the library");

    }

    public void removeMembership(Member member) {
        membership.removeMember(member);
    }



}
