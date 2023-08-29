import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                       {12,22,32,42},
                       {15,25,35,45},
                       {17,27,37,47}};
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    private static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length-1;
        while (row < arr.length && col >=0){

            if (target == arr[row][col]){
                return new int[]{row,col};
            }
            if (target > arr[row][col]) {
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
