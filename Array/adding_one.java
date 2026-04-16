import java.util.Scanner;
public class adding_one {
    public static void AddOne(int[] arr){
        int n=arr.length-1;
        int carry=1;
        for(int i=0;i<=n;i++) {
            if (arr[n] != 9) {arr[n] = arr[n] + 1;}

            break;
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

       AddOne(arr);



    }
}
