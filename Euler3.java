
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
public class Euler3 {

	public static void main(String[] args) {
		
		long start = 600851475143L;
		long num=start;
		long largest=1;
		int factor=2;
		
		while (factor*factor<=num)//check up to square root
		{
			if (num%factor==0)
			{
				num=num/factor;
				largest=factor;
			}
			else//only increments when factor is not prime
				factor++;
		}
		if (num>largest)//final reduced num will be prime
		{
			largest=num;
		}
		System.out.println(largest);

	}

}
