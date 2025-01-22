package subsytem;

import java.util.ArrayList;

public class BookCatalogue {

    public ArrayList<Book> books;

    public BookCatalogue() {
        this.books = new ArrayList<>();
    }

    // Add a book.
   public void addBook(Book book){
        this.books.add(book);
   }

   // List all books in library
    public void listAllBooks(){
        for(Book book: books){
            System.out.println("List all books in the catalogue of the Library: ");
            System.out.println( book.getTitle() + "," + book.getAuthor());
        }
    }

   // Find a book
    public void searchBook(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println("This book is available: " + book);
            }
        }
    }

    // Remove a book.
    public void removeBookFromCatalogue(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                books.remove(book);
            }
        }
    }





}
