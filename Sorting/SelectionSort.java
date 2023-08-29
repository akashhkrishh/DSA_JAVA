import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length-i-1;
            int max = getMax(arr, last);
            swap(arr,max,last);
        }

    }
    private static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    private static int getMax(int[] arr, int last) {
        int max = 0;
        for (int j = 0; j <= last; j++) {
            if (arr[j] > arr[max])
                max = j;
        }
        return max;
    }
}
