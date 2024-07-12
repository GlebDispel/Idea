package AlgorithmsAndDataStructures;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(binarySearch(arr,22));
    }

    public static int binarySearch(int[] arr, int number){
        int high = arr.length-1;
        int low = 0;
        int mid = 0;

        while (low<=high){
             mid = low+(high-low)/2;
           if (number<arr[mid]){
               high = mid-1;
           }else if (number>arr[mid]){
               low=mid+1;
           }else {
               return mid;
           }

        }
        return -1;
    }
}
