package myapp;

public class MergeSortedArray {
    public int[] mergeSortedArray(int[] nums1,int m,int[] nums2, int n){
        int i=0,j=0,k=0;
        int[] merged=new int[m+n];

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merged[k]=nums1[i];
                i++;
            }else{
                merged[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m) {
            merged[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n) {
            merged[k]=nums2[j];
            j++;
            k++;
        }

        //   for(int l=0;l<m+n;l++){
        //     nums1[l]=merged[l];
        //   }

        return merged;

    }
}
