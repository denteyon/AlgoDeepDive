public class NimarySearch {
    static int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;

        while(start+1 != end){
            int mid = start + ((end - start) /2);
            if(k == arr[mid]){
                return mid;
            } else if(k < arr[mid]){
                end = mid;
            } else if(k> arr[mid]){
                start = mid;
            }
        }
        return -1;
    }
}
