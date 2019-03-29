package old2;
public class Division
{
	public static void main(String[] args)
	{
		int x,y;
		double a,f;
		x=3;
		y=2;
		//System.out.println(x);
		//System.out.println(y);
		a = (double)x/(double)y;//on fais cast en type double
		//System.out.println(a);
		f = a*(double)y;//on fais cast en type double
		System.out.println((int)f);//on fais cast inverse en type int
	};
}