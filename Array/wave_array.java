import java.util.Scanner;
public class wave_array {

    public static void wave(int[] arr){
//       int i=0;
//       int j=1;
//       while(j<arr.length){
//           if(arr[i]<arr[j]){
//               int temp=arr[i];
//               arr[i]=arr[j];
//               arr[j]=temp;
//
//           }
 //                i=i+2;
//               j=j+2;
//       }
        for (int i = 0; i < arr.length; i += 2) {
            if(i==arr.length-1) break;
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

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
        wave(arr);

    }
}
