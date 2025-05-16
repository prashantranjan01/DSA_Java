package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 5, 9, 24, 65};
        int target = 34;
        int index = binarySearching(arr, target);
        if(index!=-1) {
            System.out.println("Element Found at Index " + index);
        }else{
            System.out.println("Element not Found");
        }
    }

    private static int binarySearching(int[] arr, int tar) {
        //return index if element found else return -1
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
