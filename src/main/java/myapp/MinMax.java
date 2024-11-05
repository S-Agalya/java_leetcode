package myapp;

public class MinMax {
    public static void main(String args[]){
        int[] arr={3,2,6,5,7,1};
        int[] result=res(arr);
        System.out.println(result[0]+" "+result[1]);

        }

        public static int[] res(int[] arr){
        bubbleSort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
        }

        public static void bubbleSort(int[] arr){
          for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
          }
        }
}
