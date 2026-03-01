package Arrays;

import java.util.*;

public class LT1Twosum {
    public static int[] twoSum(int n,int[] arr,int k){
        int[] ans=new int[2];
        Map<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<n;i++){
            int sum=k-arr[i];
            if(hash.containsKey(sum)){
                ans[0]=hash.get(sum);
                ans[1]=i;
            }

            hash.put(arr[i],i);
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int[] ans=twoSum(n, arr, k);
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");

        }

        
    }
    
}


// Time =O(N);
// Space = O(N);