// Total Bricks is given is 630 Bricks
// On First Day I completed 245 Bricks
// On from Second day OnWards Due do some other project involved, We can complete the 2/3 of PreviousDayBricksCOmpleted.
// How Many days we can complete the total bricks ?

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
