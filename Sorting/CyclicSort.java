public class Main
{
	public static void main(String[] args) {
	    int[] arr = {3,1,2,5,4};
	    for (int i=0;i<arr.length ;i++ ){
	       int ans = arr[i]-1;
	       if(arr[ans] != arr[i]){
	            int t = arr[i];
	            arr[i] = arr[ans] ;
	            arr[ans] = t;
	       }
	    } 
	   System.out.print(Arrays.toString(arr));    
	}
}
