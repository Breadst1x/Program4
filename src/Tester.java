
/*
 * Author: Anthony Cordero, Keeton Hersey
 * Date: 4/24/18
 * Overview: JTests for the dynamic lab
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Tester {

	//test variables
	public static int[] coinValues = {25,10,5,1};
	public static int centValue = 78;
	public static int numOfCoins = 6;
	public static int[] coinArray = Coin.coinArray(coinValues, centValue);
	public static int[] expectedArray = {25,25,25,1,1,1};
	
	@Test
	//makes sure the array values out of coin.java is the same as what's expected.
	public void testCoinArrayValues() {
		for(int i = 0; i < coinArray.length; i++)
			if(i < expectedArray.length)
				assertEquals(coinArray[i],expectedArray[i],"Error");
	}
	
	//tests the program in general to make sure a result exists
	@Test
	public void testForNull() {
		assertNotNull(coinArray,"Error");
	}
	
	@Test
	//tests to see if there's a negative value
	public void testForNegativeInput() {
		assertTrue(centValue > 0,"Error");
	}
	
	//test for empty array
	
	@Test
	public void testForEmptyArray() {
		assertNotNull(coinArray[0],"Error");
	}
	
	//tests to make sure the program outputs the number of coins necessary
	@Test
	public void testCoinImplement() {
		assertEquals(numOfCoins, Coin.sumLength (coinArray),"Error");
	}
	

}
