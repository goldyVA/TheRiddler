import java.util.ArrayList;

public class RiddlerClassicMar18 
{

	public static void main(String[] args) 
	{
		
		ArrayList<ArrayList<Integer>> allSequences = new ArrayList<ArrayList<Integer>>();
		
		//create all Fibonacci-like sequences with integers 1 to 100
		//sequences are 20 numbers long
		for(int m = 1; m <= 100; m++)
		{
			for(int n = m+1; n <= 100; n++)
			{
				ArrayList<Integer> sequence = new ArrayList<Integer>();
				sequence.add(m);
				sequence.add(n);
				for(int i = 2; i < 20; i++)
				{
					sequence.add(i,sequence.get(i-1)+sequence.get(i-2));
				}
				
				allSequences.add(sequence);	

			}
		}
		
		//encoded value is placed here
		int encode = 81;
		System.out.println("Value to encode: " + encode);
		System.out.println();
		
		//find the maximum q and which sequence it was in
		ArrayList<Integer> max = null;
		int maxQ = 0;
		for(ArrayList<Integer> x : allSequences)
		{
			//print all values of m and n that have a q greater than 3
			//since a q of 3 is just when the sum of two numbers is the encoded value
			if(x.indexOf(encode) > 2)
			{
				System.out.print("m: "+x.get(0)+ "\t\tn: " + x.get(1) + "\t\tq:");
				System.out.println(x.indexOf(encode)+1);
			}
			
			if(x.indexOf(encode)>maxQ)
			{
				maxQ = x.indexOf(encode)+1;
				max = x;
			}
		}
		System.out.println();
		
		//print out the max q for the given encoded value
		System.out.println("Max q for given encoded value: " + maxQ);
		//print out the sequence
		System.out.print("The sequence is: ");
		for(int x: max)
		{
			if(x<=encode)
				System.out.print(x+ " ");
		}
	}
}
