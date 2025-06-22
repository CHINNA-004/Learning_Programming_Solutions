package Exercise3_SortingCustomerOrders.Code;

public class SortingTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 1200.00),
            new Order("2", "Bob", 800.00),
            new Order("3", "Charlie", 2500.00),
            new Order("4", "David", 1500.00),
            new Order("5", "Eva", 500.00)
        };

        System.out.println("Original Orders:");
        OrderSorter.displayOrders(orders);

        System.out.println("Sorted by Bubble Sort:");
        Order[] ordersBubble = orders.clone();
        OrderSorter.bubbleSort(ordersBubble);
        OrderSorter.displayOrders(ordersBubble);

        System.out.println("Sorted by Quick Sort:");
        Order[] ordersQuick = orders.clone();
        OrderSorter.quickSort(ordersQuick, 0, ordersQuick.length - 1);
        OrderSorter.displayOrders(ordersQuick);
    }
}
