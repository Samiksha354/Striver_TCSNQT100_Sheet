
import java.util.Scanner;
import static Arrays.print_negative_element_in_array.print;


public class max_min_element {
    public static void min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <min){
                min=arr[i];
            }
        }

        System.out.println("min "+min);

    }
    public static void max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >max){
                max=arr[i];
            }
        }
        System.out.println("max "+max);

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
        max(arr);
        min(arr);




    }
}
