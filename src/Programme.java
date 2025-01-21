import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {

        System.out.println("""
                Welcome to the Library:
                1. Book Catalogue
                2. Members
                3. Borrow Book
                4. Return Book
                """);

        Scanner sc = new Scanner(System.in);
        int librarianInput = sc.nextInt();
        boolean exit = false;

        while(!exit) {
            librarianInput = sc.nextInt();

            switch(librarianInput) {
                case 1:
            }
        }

    }
}
