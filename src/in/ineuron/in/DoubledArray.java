package in.ineuron.in;
import java.util.*;
public class DoubledArray {
        public static void main(String[] args) {
	        int[] changed = {1, 3, 4, 2, 6, 8};
	        int[] original = findOriginalArray(changed);
	        System.out.println(Arrays.toString(original));
	    }

	    public static int[] findOriginalArray(int[] changed) {
	        if (changed.length % 2 != 0) {
	            return new int[0]; // Not a doubled array, return an empty array
	        }

	        Map<Integer, Integer> countMap = new HashMap<>();

	        // Count the frequency of each number in the changed array
	        for (int num : changed) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        int[] original = new int[changed.length / 2];
	        int index = 0;

	        // Iterate over the changed array
	        for (int num : changed) {
	            if (countMap.containsKey(num) && countMap.containsKey(num * 2)) {
	                // Append the number to the original array
	                original[index++] = num;

	                // Update the frequency counts
	                countMap.put(num, countMap.get(num) - 1);
	                countMap.put(num * 2, countMap.get(num * 2) - 1);

	                // Remove the numbers from the map if their count reaches zero
	                if (countMap.get(num) == 0) {
	                    countMap.remove(num);
	                }
	                if (countMap.get(num * 2) == 0) {
	                    countMap.remove(num * 2);
	                }
	            }
	        }

	        // If the original array is not fully constructed, it means changed is not a doubled array
	        if (index != original.length) {
	            return new int[0]; // Not a doubled array, return an empty array
	        }

	        // Shuffle the original array
	        Random rand = new Random();
	        for (int i = original.length - 1; i > 0; i--) {
	            int j = rand.nextInt(i + 1);
	            int temp = original[i];
	            original[i] = original[j];
	            original[j] = temp;
	        }

	        return original;
	    }
	}


