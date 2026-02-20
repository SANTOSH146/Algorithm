package Arrays;
import java.util.*;

public class LT26removedDuplicatesfromSortedArray {
    public static int removeDuplicates(int n,String[] arr){
        if(n==0){
            return 0;
        }
        
        int i=0;
        for(int j=1;j<n;j++){
            if(!arr[j].equals(arr[i])){
                arr[i+1]=arr[j];
                i++;

            }
        }
        return i+1;

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();

        }

        int k=removeDuplicates(n, arr);
        System.out.println(k);


        for(int i=0;i<n;i++){
            if(i<k){
            System.out.print(arr[i]+" ");
            }else{
                System.out.print("-"+" ");

            }

        }

    }
}

// Time = O(n);
// Space=O(1);
