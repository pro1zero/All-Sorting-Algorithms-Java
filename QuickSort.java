import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 5, 2, 9, 5, 6, 3};
		System.out.println(quickSort(nums));
	}
	
	public static String quickSort(int[] nums) {
		quickSortHelper(0, nums.length - 1, nums);
		return Arrays.toString(nums);
	}
	
	public static void quickSortHelper(int start, int end, int[] nums) {
		if(start >= end)
			return;
		
		int pivot = start;
		int left = pivot + 1;
		int right = end;
		
		while(right >= left) {
			if(nums[left] > nums[pivot] && nums[right] < nums[pivot]) {
				swap(left, right, nums);
			}
			if(nums[left] <= nums[pivot]) {
				left += 1;
			}
			if(nums[right] >= nums[pivot]) {
				right -= 1;
			}
		}
		
		swap(right, pivot, nums);
		quickSortHelper(start, right - 1, nums);
		quickSortHelper(right + 1, end, nums);
	}
	
	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
