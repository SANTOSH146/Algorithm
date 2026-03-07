package Arrays;

import java.util.*;

public class LT53maxSubarraySum {

    public static int maxSubarraySum(int n,int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }



        return maxSum;

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int ans=maxSubarraySum(n, arr);
        System.out.println(ans);
    }
    
}


// Time - O(n)
// Space - O(1)