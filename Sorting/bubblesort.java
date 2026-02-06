package Sorting;
import java.util.*;

class Bubblesort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=n-1;i>=0;i--){
            int swapcount=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapcount++;
                }
                
                
            }
            if(swapcount==0){
                    break;
                }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}


// Time = O(n2)
// space = O(1)