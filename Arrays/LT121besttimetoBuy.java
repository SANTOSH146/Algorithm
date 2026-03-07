package Arrays;

import java.util.*;

public class LT121besttimetoBuy{

    public static int buyStock(int n, int[] prices){
        int prof=0;
        int mini=prices[0];
        int curprof=0;

        for(int i=1;i<n;i++){
            curprof=prices[i]-mini;
            if(curprof>prof){
                prof=curprof;
            }

            if(prices[i]<mini){
                mini=prices[i];
            }

        }


        return prof;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        sc.close();

        int profit=buyStock(n, arr);
        System.out.println(profit);

        
    }
}


// Time =O(n);
// Space = O(1);