import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 5, 2, 9, 5, 6, 3};
		System.out.println(insertionSort(nums));
	}
	
	public static String insertionSort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			int j = i;
			while(j > 0 && nums[j] < nums[j-1]) {
				swap(j-1, j, nums);
				j--;
			}
		}
		return Arrays.toString(nums);
	}
	
	public static void swap(int i, int j, int[] nums) {
		nums[i] = nums[i] + nums[j];
		nums[j] = nums[i] - nums[j];
		nums[i] = nums[i] - nums[j];
	}
}
