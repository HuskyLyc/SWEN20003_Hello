public class Book {
    String author;
    String tittle;
    boolean isBorrowed;
    String name_borrowedBy;
    Book(){
        author = "defaultAuthor";
        tittle = "defautTittle";
        isBorrowed = false;
    }
    void borrow(String borrowedBy){
        name_borrowedBy = borrowedBy;
        isBorrowed = true;
    }
    void returnBook(){
        isBorrowed = false;

    }

}
