
class MultiThreadBythread1 extends Thread
{
	public void run()
	{
		int i = 1;
		while(i<1000)
		{
			System.out.println(i+"Thread Class");
			i++;
		}
	}
	public static void main(String args[])
	{
		MultiThreadBythread1 th = new MultiThreadBythread1();
		th.start();
		int i = 1;
		while(i<1000)
		{
			System.out.println(i+"Main Class");
			i++;
		}
	}
}