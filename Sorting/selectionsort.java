package Sorting;
import java.util.*;

class Selectionsort{

    public static void swapNumbers(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            swapNumbers(i, min, arr);
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}


// Time: O(n²)
//Space: O(1) 