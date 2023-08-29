import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,42,5,225,532,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length-i) ; j++) {
               if (arr[j-1] > arr[j]){
                   int t = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1] =t ;
               }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
