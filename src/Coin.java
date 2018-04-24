
/*
 * Author: Anthony Cordero
 * Date: 4/13/18
 * Overview: algorithm to make the fewest amount of coins for change
 */

import java.util.Arrays;

public class Coin {
	public static int[] coinArray(int[] values, int centValue) {
		int[] output = new int[centValue];//creates output array
		int step = 0;//stepper
		Arrays.sort(values);//sorts the values of the array
		while(centValue >= values[0])
			//while the value of the coin is higher than the change value
			
		{
			for(int i = values.length-1; i >= 0; i--)//for each item in the value array, this runs
			{
				if(centValue >= values[i])//if the value of the coin is greater than the value needed for change,
				{
					output[step] = values[i];//the current value of the iterator is set to the value in the array
					centValue -= values[i];//decreases the value of the change needed to be dispensed
					break;
				}
			}
			step++;//increment
		}
		for(int i = 0; i < output.length; i++)
			//for each item in the output array,
		{
			if(output[i] == 0)//if the output is 0
			{//there is no need to carry on. This is the end of the array.
				if(i == 0)
					break;
				int[] newOut = new int[i];//new array
				for(int j = 0; j < i; j++)
				{
					newOut[j] = output[j];//creates a temporary name place holder
				}
				output = newOut;
				break;
			}
		}
		return output;
	}
	//returns the number of coins
	public static int coinAdder(int[] in)
	{
		return in.length;
	}
}
