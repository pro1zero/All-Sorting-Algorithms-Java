import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 5, 2, 9, 5, 6, 3};
		System.out.println(bubbleSort(nums));
	}
	
	public static String bubbleSort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j])
					swap(i, j, nums);
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
