package in.ineuron.in;
import java.util.Arrays;
public class ArrsyConstruction {



	    public static int[][] construct2DArray(int[] original, int m, int n) {
	        int totalElements = m * n;
	        if (original.length != totalElements) {
	            return new int[0][0]; // Return empty 2D array if impossible
	        }
	        
	        int[][] result = new int[m][n];
	        for (int i = 0; i < totalElements; i++) {
	            result[i / n][i % n] = original[i];
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] original = {1, 2, 3, 4};
	        int m = 2;
	        int n = 2;
	        
	        int[][] constructedArray = construct2DArray(original, m, n);
	        for (int[] row : constructedArray) {
	            System.out.println(Arrays.toString(row));
	        }
	    }
	}


