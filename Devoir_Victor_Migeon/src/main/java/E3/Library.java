package E3;

import java.util.List;

/**
 * Classe de la bibliothèque permettant de stocker les livres
 */
public class Library {
    public static List<Book> books;

    /**
     * Ajout d'un livre dans la bibliothèque
     * @param book
     */
    public static void addBook(Book book){
        books.add(book);
        //System.out.println(books);
    }

    /**
     * Vérifier si le livre est disponible dans la bibliothèque
     */
    public static void isBookAvailable(Book book){
        books.contains(book);
    }

    /**
     * Permet à un utilisateur d'emprunter un livre dans la bibliothèque
     */
    public static void borrowBook(Book book, User user){
        user.borrowedBooks.add(book);
        books.remove(book);

    }

}
