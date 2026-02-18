package Arrays;
import java.util.*;

public class LT283moveZeroestoEnd {

    public static void moveZeroes(int n, int[] arr){
        int j=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0){
                j=i;
                break;
                
            }
        }

        if(j==-1){
            return;
        }

        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        
    }





    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        moveZeroes(n, arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


// Time =O(n);
// space=O(1);