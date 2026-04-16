


import java.util.Scanner;

public class Addition {
    public static void addarr(int[] arr, int size, int[] arr2) {

        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] + arr2[i];
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create arrays
        int[] arr = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter the array1 elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the array2 elements: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        addarr(arr, size, arr2);
    }

}
