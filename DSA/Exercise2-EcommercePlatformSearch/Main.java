import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Sorted array of products
        String[] products = {
                "Camera",
                "Headphones",
                "Keyboard",
                "Laptop",
                "Mobile",
                "Mouse",
                "Speaker"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name to search: ");
        String searchProduct = sc.nextLine();

        int low = 0;
        int high = products.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchProduct.compareToIgnoreCase(products[mid]);

            if (result == 0) {
                System.out.println("Product Found at index : " + mid);
                found = true;
                break;
            }
            else if (result > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}
