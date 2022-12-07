
class Mythread extends Thread{
	public void run()
	{
		int i = 1;
		while(i<1000)
		{
			System.out.println(i+"Thread Class");
			i++;
		}
	}
}
class MultiThreadBythread
{
	public static void main(String args[])
	{
		Mythread th = new Mythread();
		th.start();
		int i = 1;
		while(i<1000)
		{
			System.out.println(i+"Main Class");
			i++;
		}
	}
}