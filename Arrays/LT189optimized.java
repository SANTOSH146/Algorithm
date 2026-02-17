package Arrays;
import java.util.*;

public class LT189optimized {
    public static void reverseArray(int start, int end, int[] arr){
        int i=start;
        int j=end-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void rotateLeft(int n,int k,int[] arr){
        k=k%n;
        reverseArray(0,k, arr);
        reverseArray(k, n, arr);
        reverseArray(0, n, arr);
    }

    public static void rotateRight(int n,int k,int[] arr){
        k=k%n;
        reverseArray(0, n, arr);
        reverseArray(0,k, arr);
        reverseArray(k, n, arr);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        // rotateLeft(n,k,arr);
        rotateRight(n, k, arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
    
