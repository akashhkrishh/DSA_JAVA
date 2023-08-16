public class CeilingSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,10};
        int target = 3;
        System.out.print(findCeiling(arr,target));
    }
    private static int findCeiling(int[] arr, int target) {
        if(target > arr.length-1)
            return -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start+(end - start)/2;
            if (arr[mid]==target)
                return arr[mid];
            if(arr[mid]>target)
                end = mid-1;
            else if (arr[mid]<target) {
                start = mid+1;
            }
        }
        return arr[start];
    }
}
