package E3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Permet de tester l'emprunt de livres dans la bibliothèque
 */
public class LibraryIntegrationTest {

    /**
     * Vérifie si un utilisateur peut emprunter un livre avec succès
     */
    @Test
    public void testBorrowBook(){
        Library library = new Library();//Instance de la classe Library
        Book book = new Book("Livre 1", "Autheur 1");//Instance de la classe Book représentant un livre dispo dans la bibliothèque
        User user = new User("Charli");//Instance de la classe User

        Library.addBook(book);

        //Appeler la méthode BorrowBook() de la classe Library en pasant le livre et l'utilisateur e, tant que paramètres
        // Utiliser des assertions pour vérifier si le user a emprunté le livre avec succès et si le livre a été retiré de la bibliothèque

    }
}
