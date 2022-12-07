class my implements Runnable
{
	public void run()
	{
		int i=1;
		while (i<1000)
		{
			System.out.println(i+" Runnable ThreadClass");
			i++;
		}
	}
}

class MultiThreadByRunnable
{
	public static void main(String args[])
	{
		my m=new my();
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