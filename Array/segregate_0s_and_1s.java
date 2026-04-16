import java.util.Scanner;
public class segregate_0s_and_1s {
    public static void segregate(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){count++;}

        }
        for(int i=0;i<arr.length;i++){
            if(i< count){System.out.print((arr[i]=0)+" ");}
            else{
                System.out.print((arr[i]=1)+" ");
            }
        }

    }
    //two pointer technique
    public static void segregate2(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i <= j){
            if (arr[i] == 0) {
                i++;
            }
            else if (arr[j] == 1) {
                j--;
            }
            else{
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
            }
        }
        for(int k=0;k<arr.length;k++){
           System.out.print(arr[k]+" ");

        }

    }

    //if zeroes and number are present nums = [0,1,0,3,12]

    public static void segregate3(int[] arr){
        int j = 0;   // points to position for next non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");

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

//       segregate(arr);
        segregate2(arr);
//        segregate3(arr);

    }
}
