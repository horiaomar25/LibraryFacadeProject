package subsytem;

import java.util.ArrayList;

public class BorrowBook {

    // Array List that holds borrowBook
    ArrayList<Book> borrowedBooks;

    public BorrowBook() {
        borrowedBooks = new ArrayList<>();
    }


    public void borrowBook(Book book, String libraryCardNumber) {
        borrowedBooks.add(book);

        System.out.println("This book " + book.getTitle() + " has been borrowed!");
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }





}
