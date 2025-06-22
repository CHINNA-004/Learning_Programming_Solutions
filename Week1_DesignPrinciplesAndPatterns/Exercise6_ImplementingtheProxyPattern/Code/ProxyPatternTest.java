package Exercise6_ImplementingtheProxyPattern.Code;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");

        System.out.println("Displaying first image:");
        img1.display(); 

        System.out.println("\nDisplaying first image again:");
        img1.display(); 

        System.out.println("\nDisplaying second image:");
        img2.display(); 
    }
}
