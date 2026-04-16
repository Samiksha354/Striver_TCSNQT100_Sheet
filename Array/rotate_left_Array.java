import java.util.Scanner;
public class rotate_left_Array {
    public static void  reverse(int[] arr,int start,int end){
        int i=start;
        int j=end;
        while(i < j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void  rotate(int[] arr,int k){
        //edge cases are must
        int len=arr.length;
        if (len <= 1) return;
        k = k % len;
        if (k == 0) return;
        reverse(arr,0,len-1);
        reverse(arr,0,k-1);
        reverse(arr,(k),len-1);
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
        System.out.println("Enter the number of the rotation :");
        int k=sc.nextInt();
        rotate(arr,k);

    }
}
