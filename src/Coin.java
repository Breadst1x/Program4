/*
 * Authors: Keeton Hersey, AJ Cordero
 * Date: 4.24.18
 * Notes: Implementation of dynamic algorithms
 */



import java.util.Arrays;

public class Coin {
	public static int[] coinArray(int[] coinValues, int centValue) {
		int[] out = new int[centValue];
		int iter = 0;
		Arrays.sort(coinValues);
		while(centValue >= coinValues[0])
		{
			for(int i = coinValues.length-1; i >= 0; i--)
			{
				if(centValue >= coinValues[i])
				{
					out[iter] = coinValues[i];
					centValue -= coinValues[i];
					break;
				}
			}
			iter++;
		}
		for(int i = 0; i < out.length; i++)
		{
			if(out[i] == 0)
			{
				if(i == 0)
					break;
				int[] reOut = new int[i];
				for(int j = 0; j < i; j++)
				{
					reOut[j] = out[j];
				}
				out = reOut;
				break;
			}
		}
		return out;
	}
	public static int sumLength(int[] in)
	{
		return in.length;
	}
}
