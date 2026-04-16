import java.util.Scanner;
public class product_of_array {
    public static void product(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        System.out.println("product______" + product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println();
        product(arr);
    }
}