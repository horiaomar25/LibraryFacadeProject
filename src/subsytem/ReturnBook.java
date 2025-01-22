package subsytem;

import java.util.ArrayList;

public class ReturnBook {

    private ArrayList<Book> returnBook;

    public ReturnBook() {
        this.returnBook = new ArrayList();
    }

    public void returnBook(Book book) {
        returnBook.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }

    public ArrayList<Book> getReturnBook() {
        return returnBook;
    }
}
