package mayur;

public class SwapNumberWithoutThirdVeriable 
{
	public static void main(String[] args) 
	{
		float Num1 = (float) Double.parseDouble(args[0]);
		float Num2 = (float) Double.parseDouble(args[1]);
		SwapNumberWithoutThirdVeriable s = new SwapNumberWithoutThirdVeriable();
		s.swap(Num1, Num2);
	}

	void swap(float a, float b) 
	{
		System.out.println("Numbers before swaping: Number1 =" + a + " and Number2 =" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swaping: Number1 =" + a + " and Number2 =" + b);
	}
}
