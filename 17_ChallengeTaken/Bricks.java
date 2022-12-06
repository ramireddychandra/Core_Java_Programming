public class Bricks
{
	public static void main(String args[])
	{
		int allBricks = 630;
		float previousBricks = 245;
		float RemainingBricks = 385;
		int count = 1;
		float ratio = 2/3f;
		System.out.println(2/3);
		while(RemainingBricks>0)
		{
			previousBricks=(previousBricks*(2/3f));
			RemainingBricks=RemainingBricks-previousBricks;
			count++;
			//System.out.println(previousBricks);
		}
		System.out.println(count);
	}
}