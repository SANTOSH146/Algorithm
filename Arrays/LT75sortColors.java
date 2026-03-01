package Arrays;

import java.util.*;

public class LT75sortColors{
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void sortColors(int n,int[] arr){
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(mid,low,arr);
                low++;
                mid++;

            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(mid,high,arr);
                high--;
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

        sortColors(n, arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}

}


// Time=o(n);
// Space = 0(1)