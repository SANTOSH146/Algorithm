package Arrays;

import java.util.*;

public class LT53maxSubarraySum {

    public static int[] maxSubarraySum(int n,int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int ansStart=-1;
        int ansEnd=-1;
        int start=0;
        int[] ans=new int[3];

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }

        ans[0]=ansStart;
        ans[1]=ansEnd;
        ans[2]=maxSum;





        return ans;

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int[] ans=maxSubarraySum(n, arr);
        for(int i=ans[0];i<=ans[1];i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println(ans[2]);
    }
    
}


// Time - O(n)
// Space - O(1)