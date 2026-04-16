import java.util.Scanner;
public class secondMax_and_secondMin {
    public static int secondMin(int[] arr){
        int secmin=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]<secmin  && arr[i]>min){
                secmin=arr[i];
            }
        }
        return secmin;
    }

    public static int secondMax(int[] arr){
        int secmax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax  && arr[i] < max){
                secmax=arr[i];
            }
        }
    return secmax;
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


        System.out.println();


        System.out.println("\nSECOND MAX");
        System.out.print(secondMax(arr));

        System.out.println("\nSECOND MIN");
        System.out.print(secondMin(arr));



    }
}
