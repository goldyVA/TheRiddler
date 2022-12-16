
public class RiddlerDec16 
{
	public static void main(String[] args) 
	{	
		int count = 0;
		int min = Integer.MAX_VALUE;
		String minstring = "";
		for(int i = 1; i <= 2023; i++)
		{
			for(int j = i ; j <= 2023; j++)
			{
				for(int k = j; k <= 2023; k++)
				{
					if(trib2023(i, j, k))
					{
							count++;
							if(i + j + k < min)
							{
								min = i + j + k;
								minstring = i + " " + j + " " + k;
							}
					}
							
				}
			}
		}
		System.out.println("Total tribonacci sequences containing 2023: " + count);
		System.out.println("Minimum sum: " + min);
		System.out.println("a b and c for minimum sum:" + minstring);
	}
	
	public static boolean trib2023(int a, int b, int c)
	{
		int sum = a + b + c;
		while(sum <= 2023)
		{
			a = b;
			b = c;
			c = sum;
			sum = a + b + c;
			if(sum == 2023)
				return true;
		}
		return false;
	}
	
	public static void printtrib2023(int a, int b, int c)
	{
		int sum = a + b + c;
		while(sum <= 2023)
		{
			System.out.println(a+ " " + b + " " + c + " Sum: " + sum);
			a = b;
			b = c;
			c = sum;
			sum = a + b + c;
		}
	}
}
