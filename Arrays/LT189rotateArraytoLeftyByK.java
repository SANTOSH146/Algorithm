package Arrays;
import java.util.*;

public class LT189rotateArraytoLeftyByK {

    public static void rotateLeftbyK(int n,int[] arr,int k){
        int[] temp = Arrays.copyOfRange(arr, 0, k);
        k=k%n;
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }

        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }


        rotateLeftbyK(n, arr,k);




        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
    
}


// Time = O(n)
// space = O(k)