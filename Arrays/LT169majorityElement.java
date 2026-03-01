package Arrays;

import java.util.*;

public class LT169majorityElement {

    public static int majorityElement(int n, int[] arr){

        int count=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=arr[i];
            }
            if(arr[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int ans=majorityElement(n, arr);
        System.out.println(ans);
    }
    
}


// Time = O(n);
// Space=O(1);