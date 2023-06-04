package in.ineuron.in;

public class StairCase {

	    public static int countCompleteRows(int n) {
	        int completeRows = 0;
	        int coins = n;
	        int row = 1;
	        
	        while (coins >= row) {
	            coins -= row;
	            completeRows++;
	            row++;
	        }
	        
	        return completeRows;
	    }
	    
	    public static void main(String[] args) {
	        int n = 5;
	        int completeRows = countCompleteRows(n);
	        System.out.println("Number of complete rows: " + completeRows);
	    }
	}



