package Arrays;

import java.util.*;
class UnionofTwoSortedArrays {
    public static List<Integer> UnionArray(int n1, int n2,int[] arr1,int[] arr2){
        
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=arr1[i] ){
                    ans.add(arr1[i]);
                }
                i++;
            }else{
                if(ans.isEmpty() || ans.get(ans.size()-1)!=arr2[j] ){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        
        
        
        while(j<n2){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=arr2[j] ){
                    ans.add(arr2[j]);
                }
                j++;
        }
        
        while(i<n1){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=arr1[i] ){
                    ans.add(arr1[i]);
                }
                i++;
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        
        for(int j=0;j<n2;j++){
            arr2[j]=sc.nextInt();
        }
        
        List<Integer> ans=UnionArray(n1,n2,arr1,arr2);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}

