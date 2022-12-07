

class MultiThreadByRunnable1 implements Runnable
{
	public void run()
		{
			int i=1;
			while (i<1000)
			{
				System.out.println(i+" Runnable Thread Class");
				i++;
			}
		}
	public static void main(String args[])
	{
		
		MultiThreadByRunnable1 m=new MultiThreadByRunnable1();
		Thread t = new Thread(m);
		t.start();
		int i=1;
		while (i<1000)
		{
			System.out.println(i+" Main Class");
			i++;
		}
	}
}