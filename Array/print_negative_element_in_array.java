

import java.util.Scanner;

public class print_negative_element_in_array {

     public static void print(int[] arr){
         System.out.println("Print the elements of the array :");
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }

    }

    public static void negative_ele(int[] arr){
         for(int i=0;i<arr.length;i++){
             if(arr[i] < 0){
                 System.out.print(arr[i]+" ");
             }
         }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        print(arr);
        System.out.println();
        negative_ele(arr);



    }
}
