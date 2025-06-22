import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Smartphone", "Electronics"),
            new Product(4, "T-shirt", "Fashion"),
            new Product(5, "Book", "Education")
        };

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        String searchName = "Smartphone";

        Product resultLinear = SearchUtil.linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not Found"));

        Product resultBinary = SearchUtil.binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not Found"));
    }
}
