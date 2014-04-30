
public class Euler1 {

	public static void main(String[] args) {

		int sum = 0;
		 
		for (int i=0;i<1000;i+=3)
		{
			sum=sum+i;
		}
		for (int j = 0;j<1000;j+=5)
		{
			if (j%3 != 0)
				sum+=j;
		}
		System.out.println(sum);

	}

}
