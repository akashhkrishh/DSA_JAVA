public class Main
{
	public static void main(String[] args) {
	    int[] arr = {3,1,2,5,4};
	    int i=0;
	    while (i < arr.length ){
	       int ans = arr[i];
	       if(arr[i] < arr.length && arr[ans] != arr[i]){
	            int t = arr[i];
	            arr[i] = arr[ans] ;
	            arr[ans] = t;
	       }else{
	           i++;
	       }
	    } 
	   System.out.print(Arrays.toString(arr));    
	}
}
