public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,10};
        int target = 4;
        System.out.print(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start+(end - start)/2;
            if (arr[mid]==target)
                return mid;
            if(arr[mid]>target)
                end = mid-1;
            else if (arr[mid]<target) {
                start = mid+1;
            }
        }
        return -1;
    }
}
