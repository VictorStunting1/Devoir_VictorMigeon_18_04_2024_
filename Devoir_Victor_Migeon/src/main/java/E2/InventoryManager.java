package E2;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;

/**
 * Classe pour un gestionnaire de magasin
 * Gestion des quantités d'un produit
 */

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }
    /**
     * Ajoute un produit avec une quantité donnée dans l'inventaire
     * @param productId Identifiant du produit
     * @param quantity Quantité à ajouter
     */
    public void addProduct(String productId, int quantity) {
        inventory.put(productId, inventory.getOrDefault(productId, 0) + quantity);
    }

    /**
     * Supprimer un produit possédant une quantité spécifique
     * @param productId Id du produit
     * @param quantity Qtt à retirer
     * @throws IllegalArgumentException Si produit non présent dans l'inventaire / Si Qtt à retirer est trop grande
     */
    public void removeProduct(String productId, int quantity) {
        if (!inventory.containsKey(productId)) {
            throw new IllegalArgumentException("Le produit n'est pas présent dans l'inventaire");
        }

        int currentQuantity = inventory.get(productId);
        if (quantity > currentQuantity) {
            throw new IllegalArgumentException("La quantité à retirer est trop grande par rapport à ce qu'il y a dans l'inventaire");
        }

        inventory.put(productId, currentQuantity - quantity);
    }

    /**
     * Renvoie la quantité de stock disponible pour un produit donné
     * @param productId Identifiant du produit
     * @return Quantité de stock disponible
     */
    public int getStockAvailability(String productId) {
        return inventory.getOrDefault(productId, 0);
    }

}
