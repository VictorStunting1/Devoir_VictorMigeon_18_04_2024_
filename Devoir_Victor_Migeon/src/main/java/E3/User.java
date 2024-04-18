package E3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class User pour gérer les utilisateurs et leurs listes de livres empruntés dans la bibliothèque
 */
public class User {
    private String name;
    private List<Book> borrowedBooks;
    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }



}