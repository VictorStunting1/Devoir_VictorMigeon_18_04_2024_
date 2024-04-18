package E2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Classe permettant de tester pour plusieurs cas de figure le stock de la classe InventoryManager
 */
public class InventoryManagerTest {
    InventoryManager inventoryManager = new InventoryManager();

    /**
     * Méthode de test pour vérifier que le produit produit1 s'ajoute bien à l'inventaire
     */
    @Test
    public void testAddProduct() {
        inventoryManager.addProduct("product1", 10);
        assertEquals(10, inventoryManager.getStockAvailability("product1"));
    }

    /**
     * Méthode de test pour vérifier la diminution de quantité d'un produit produit2 dans l'inventaire
     */
    @Test
    public void testRemoveProduct() {
        inventoryManager.addProduct("product2", 15);
        inventoryManager.removeProduct("product2", 5);
        assertEquals(10, inventoryManager.getStockAvailability("product2"));
    }

    /**
     * Méthode permettant de voir si un produit non existant peut êytre supprimé de l'inventaire
     */
    @Test
    void testRemoveProductNotInInventory() {
        assertThrows(IllegalArgumentException.class, () -> inventoryManager.removeProduct("product7", 1));
    }

    /**
     * Méthode permettant de voir si les quantité peuvent être retirés de l'inventaire même si elle sont pas toutes présentes
     * (plus de quantités retirés que ce que le magasin possède réellement)
     */
    @Test
    void testRemoveProductWithQuantityTooLarge() {
        inventoryManager.addProduct("product8", 5);
        assertThrows(IllegalArgumentException.class, () -> inventoryManager.removeProduct("product8", 10));
    }


    /**
     * Méthode de test pour vérifier que le stock est suffisant
     * 100 unités dispo pour un produit donné
     */
    @Test
    public void testInventoryStokSuffisant() {
        assertEquals(0, inventoryManager.getStockAvailability("product3"));
        inventoryManager.addProduct("product3", 100);
        assertEquals(100, inventoryManager.getStockAvailability("product3"));
    }

    /**
     * Méthode de test pour vérifier que le stock est insuffisant
     * 5 unités dispo pour un produit donné
     */
    @Test
    void testInventoryStokInsuffisant() {
        assertEquals(0, inventoryManager.getStockAvailability("product4"));
        inventoryManager.addProduct("product4", 5);
        assertEquals(5, inventoryManager.getStockAvailability("product4"));
    }

    /**
     * Méthode de test pour vérifier que le stock est épuisé
     * 0 unités dispo pour un produit donné
     */
    @Test
    void testInventoryStokEpuise() {
        assertEquals(0, inventoryManager.getStockAvailability("product5"));
        inventoryManager.addProduct("product5", 0);
        assertEquals(0, inventoryManager.getStockAvailability("product5"));

    }

    /**
     * Méthode de test pour vérifier qu'un produit n'existe pas dans l'inventaire
     */
    @Test
    void testInventoryProductDoesntExist() {
        assertEquals(0, inventoryManager.getStockAvailability("product6"));

    }

}
