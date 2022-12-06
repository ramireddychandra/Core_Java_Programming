import ChanduPack.Greet;
import ChanduPack.Append;
import ChanduPack.activity.Dance;

class UsePackage
{
	public static void main(String args[])
	{
		Greet g = new Greet();
		Append a = new Append();
		Dance d = new Dance();
		
		g.GreetMe("Chandu");
		a.Appended("Chandu");
		d.Danced("Chandu");
		
	}
}