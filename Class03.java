package Java10;
class Caaa
{
	public int num1;
	public int num2;
	public Caaa()	//(a)
	{
		num1=1;
		num2=2;
	}
	public Caaa(int a,int b)	//(b)
	{
		num1=a;
		num2=b;
	}
	void show()
	{
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
class Cbbb extends Caaa
{
	public Cbbb(int a,int b)	//(c)
	{
		super(a,b);
	}
	void set_num(int a,int b)
	{
		num1=a;
		num2=b;
	}
}
public class Class03
{
	public static void main(String[] args)	//(d)
	{
		Caaa a=new Caaa();
		Caaa b=new Caaa(0,0);
		Cbbb c=new Cbbb(5,10);
		a.show();
		b.show();
		c.show();
	}
}