import java.util.Scanner;
public class search_element_in_array_boolean_result {
    public static boolean search(int[] arr,int target){
           for(int i=0 ;i<arr.length;i++){
               if(target == arr[i]) return true;

           }
        return false;

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

        System.out.println("Enter the elemnet to be search :");
        int target=sc.nextInt();


        System.out.println();
        boolean  flag= search(arr , target);
        if(flag == true) System.out.print("element present");
        else System.out.print("element is not present");
    }
}
