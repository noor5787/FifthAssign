package in.ineuron.in;

public class DistanceValue {
	
	    public static int getDistanceValue(int[] arr1, int[] arr2, int d) {
	        int distanceValue = 0;
	        for (int i = 0; i < arr1.length; i++) {
	            boolean found = false;
	            for (int j = 0; j < arr2.length; j++) {
	                if (Math.abs(arr1[i] - arr2[j]) <= d) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                distanceValue++;
	            }
	        }
	        return distanceValue;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {4, 5, 8};
	        int[] arr2 = {10, 9, 1, 8};
	        int d = 2;
	        int distanceValue = getDistanceValue(arr1, arr2, d);
	        System.out.println("Distance value: " + distanceValue);
	    }
	}


