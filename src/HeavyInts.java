import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HeavyInts {

	static int numdigits = 0;
	
	public static void main(String[] args) {
		//System.out.println("RESULT: " + heavy_decimal_count(8675, 8689));

	}
	
	//A is an integer within the range [0..200,000,000];
    //B is an integer within the range [0..200,000,000];
    //A <= B
	public static int heavy_decimal_count(int A,int B)
	{
		int heavycount = 0;
		//iterate through the range of inputs
		for (int i = A; i <= B; i++)
		{
			//get the digits of the int separately so we can work on them
			List<Integer> digits = digits(i);
			
			//get the sum of the individual digits
			float sum = 0;
			for (Integer x : digits)
			{
				//System.out.println("digit: " + x.intValue());
				sum += x.intValue();
			}
			
			float avg = sum / digits.size();
			System.out.println("AVERAGE: " + avg);
			if (avg > 7)
			{
				heavycount++;
			}
		}
		
		return heavycount;
	}
	
	//helper function to convert an integer into separate digits as a list
	public static List<Integer> digits(int i) {
		
		if (i == 0)
		{
			return Arrays.asList(0);
		}
		
	    List<Integer> digits = new ArrayList<Integer>();
	    while(i > 0) 
	    {
	    	numdigits += i%10;
	        digits.add(i % 10);
	        i /= 10;
	    }
	    return digits;
	}

}
