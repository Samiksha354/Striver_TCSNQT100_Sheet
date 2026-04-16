

import java.util.Scanner;

import static Arrays.print_negative_element_in_array.print;

public class missing_in_array {



    public static void missing(int[] arr){
        //edge cases are must
        int sum=0,sumidx=1; //it is needed to add 1 in length
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            sumidx=sumidx+i;
        }
        System.out.print("missing elements:"+(sum-sumidx));
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

        missing(arr);

    }
}
