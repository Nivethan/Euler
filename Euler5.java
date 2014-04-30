
public class Euler5 {

	public static void main(String[] args) {
	
		int range = 20;
		long product=1;
		int[] factors = new int[range];
		
		for (int i=0;i<range;i++)
		{
			factors[i]=i+1;
		}
		
		for (int i=1;i<range;i++)
		{
			if (factors[i]!=1)
			{
				product=product*factors[i];
				for (int j=i+1;j<range;j++)
				{
					if (factors[j]>=factors[i])
					{
						if (factors[j]%factors[i]==0)
							factors[j]=factors[j]/factors[i];
					}

				}
				factors[i]=1;
			}
		}
		System.out.println(product);
		
	}

}
