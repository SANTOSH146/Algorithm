package Arrays;
import java.util.*;

public class LT1752{
    public static boolean checkArraySorted(int n,int[] nums) {
        if(n==0 || n==1){
            return true;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }

        }
        return count<=1;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println(checkArraySorted(n,arr));



    }

}