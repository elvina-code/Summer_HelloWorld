package Exercises;

public class BinarySearch {
    public static void main(String[] args) {
    int [] arr = {1,2,5,7,4,8,23,65,78};
        System.out.println(binarySearch(arr, 78));
    }
    public static int binarySearch(int [] arr, int val){
        int start = 0;
        int end = arr.length-1;

        for(int mid = end/2; start <= end; mid = (end+start)/2){
            if(arr[mid] == val) return mid;
            else {
                if (arr[mid] > val)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
