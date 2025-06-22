package Exercise1_InventoryManagementSystem.Code;

public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product("1", "Laptop", 10, 750.00));
        manager.addProduct(new Product("2", "Keyboard", 50, 25.00));
        manager.addProduct(new Product("3", "Mouse", 40, 15.00));

        manager.displayInventory();

        manager.updateProduct("1", 8, 720.00);

        manager.deleteProduct("2");

        manager.displayInventory();
    }
}
