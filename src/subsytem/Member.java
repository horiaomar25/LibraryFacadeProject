package subsytem;

public class Member {

   private String name;
   private String libraryCardNumber;

   public Member(String name,String libraryCardNumber) {
       this.name = name;
       this.libraryCardNumber = libraryCardNumber;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }
}
