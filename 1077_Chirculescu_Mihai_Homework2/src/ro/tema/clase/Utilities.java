package ro.tema.clase;

import ro.tema.exceptions.CustomException;

public final class Utilities {
	public static int getMax(int[] vector) throws Exception
	{
		if(vector == null || vector.length==0) {
			throw new Exception();
		}
		
		int max = vector[0];
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>max)
				max=vector[i];
		}
		return max;
	}
}
