package training.classes.scaler.binaryproblems;

public class LocalMaxElement {

	//approach 1 -- using loop
	//tc -> O(n) and sc ->(1)
	public static int getLocalMaxElementIndex(int[] arr){

		if(arr.length ==1 || arr[0]> arr[1]){
			return 0;
		}
		if(arr[arr.length-1]> arr[arr.length-2]){
			return arr.length-1;
		}
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]>arr[i-1] && arr[i]> arr[i+1]){
				return i;
			}
		}
		return -1;
	}

	//approach 2 - using binary search
	//tc -> O(logn) and sc -> (1)
	public static int getLocalMaxElementIndex_2(int[] arr){

		if(arr.length ==1 || arr[0]>arr[1]){
			return  0;
		}
		if(arr[arr.length-1]>arr[arr.length-2]){
			return arr.length-1;
		}
		int low = 1;
		int high = arr.length-2;
		while(low<=high){
			int mid = low +((high-low)/2);
			if(arr[mid]>arr[mid+1] && arr[mid]> arr[mid-1]){
				return mid;
			}
			else if(arr[mid]<arr[mid-1]){
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		int[] arr={2, 4, 1, 8, 10, 14, 16, 13};
		System.out.println(getLocalMaxElementIndex(arr));
		System.out.println(getLocalMaxElementIndex_2(arr));

	}
}
