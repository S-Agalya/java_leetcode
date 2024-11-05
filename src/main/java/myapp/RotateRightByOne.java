package myapp;

public class RotateRightByOne {
    public int[] RotateRightbyOne(int[] arr){
        // int[] arr={1,2,3,4,5};
        int lastelement=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastelement;
        return arr;
    
    }
}
