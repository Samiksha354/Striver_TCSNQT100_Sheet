import java.util.Scanner;
public class twoSum {
    public static int[] twosumarr(int[] arr,int targetsum){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                  if(arr[i]+arr[j] == targetsum){
                      return new int[]{arr[i],arr[j]};
                  }
            }
        }
        return new int[]{};

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

        System.out.println("Enter target sum you want :");
        int targetsum=sc.nextInt();

        int[] result = twosumarr(arr, targetsum);

        if (result.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Pair is: " + result[0] + " , " + result[1]);
        }








    }
}
