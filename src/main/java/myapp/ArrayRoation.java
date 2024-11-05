package myapp;

public class ArrayRoation {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public int[] arrayRotation(int[] arr,int k){
        
        int n=arr.length;
        if(n==0){
            return arr;
        }

       
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        return arr;
        
    }
}
