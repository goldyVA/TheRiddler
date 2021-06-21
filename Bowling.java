import java.util.ArrayList;

public class Bowling 
{

	public static void main(String[] args) 
	{
		//Create an ArrayList of the different possible games - there are 120 possibilities
		ArrayList<int[]> games = new ArrayList<int []>();
		for(int i = 0; i <8; i++)
		{
			for(int j = i+1; j<9; j++)
			{
				for(int k = j+1; k<10; k++)
				{
					int[] temp = new int[10];
					temp[i] = 1;
					temp[j] = 1;
					temp[k] = 1;
					games.add(temp);
				}
			}
		}
	
		//print out each game with the score of the game
		//tally the total scores
		int scoreSum = 0;
		for(int[] temp: games)
		{
			int score = 0;
			for(int i = 0; i<temp.length; i++)
			{
				if(i< 8)
				{
					if(temp[i] == 1 && temp[i+1]==1 && temp[i+2] == 1)
					{
						score+=60;
						i+=2;
					}
					else if(temp[i] == 1 && temp[i+1]==1)
					{
						score+=30;
						i++;
					}
					else if(temp[i] == 1)
					{
						score+=10;
					}
					
				}
				else if(i==8)
				{
					if(temp[i] == 1 && temp[i+1]==1)
					{
						score+=30;
						i++;
					}
					else if(temp[i] == 1)
					{
						score+=10;
					}
				}
				else
				{
					if(temp[i] == 1)
					{
						score+=10;
					}
				}
				
			}
			
			for(int i = 0; i<temp.length; i++)
			{
				System.out.print(temp[i]);
			}
			System.out.println(" " + score);
			scoreSum += score;
		}
		
		//determine the average score
		System.out.println(scoreSum/(double)games.size());
	}
}
