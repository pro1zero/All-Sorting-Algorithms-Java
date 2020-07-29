import java.util.*;
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 5, 2, 9, 5, 6, 3};
		System.out.println(selectionSort(nums));
	}
	
	public static String selectionSort(int[] nums) {
		int pivot = 0;
		
		while(pivot < nums.length - 1) {
			int smallest = pivot;
			for(int i = pivot + 1; i < nums.length; i++) {
				if(nums[smallest] > nums[i]) {
					smallest = i;
				}
			}
			swap(pivot, smallest, nums);
			pivot++;
		}
		return Arrays.toString(nums);
	}
	
	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
