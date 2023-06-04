package in.ineuron.in;

public class MinimumInRotatedArray {

	    public static int findMinimum(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;
	        
	        // If the array is not rotated, return the first element
	        if (nums[left] < nums[right]) {
	            return nums[left];
	        }
	        
	        // Perform binary search to find the minimum element
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            
	            // Check if mid is the minimum element
	            if (nums[mid] > nums[mid + 1]) {
	                return nums[mid + 1];
	            }
	            
	            // Check if mid-1 is the minimum element
	            if (nums[mid - 1] > nums[mid]) {
	                return nums[mid];
	            }
	            
	            // If the left half is sorted, search in the right half
	            if (nums[left] < nums[mid]) {
	                left = mid + 1;
	            }
	            // If the right half is sorted, search in the left half
	            else {
	                right = mid - 1;
	            }
	        }
	        
	        // Return the minimum element
	        return nums[left];
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {3, 4, 5, 1, 2};
	        int minimum = findMinimum(nums);
	        System.out.println("The minimum element is: " + minimum);
	    }
	}


