package mayur;

public class Calculator
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		double val1 = Double.parseDouble(args[0]);
		double val2 = Double.parseDouble(args[1]);
		System.out.println("Numbers Enter by user are : " + val1 + "," + val2);
		System.out.println("Addition is  " + c.addition(val1, val2));
		System.out.println("Substraction is  " + c.substraction(val1, val2));

		if (val1 == 0 || val2 == 0) 
		{
			System.out.println("You cannot multiply or divide number by Zero(0)");
		} 
		else 
		{
			System.out.println("Multiplication is  " + c.multiplication(val1, val2));
			System.out.println("Division is  " + c.division(val1, val2));
			System.out.println("Remainder is  " + c.remainder(val1, val2));

		}

	}

	public double addition(double value1, double value2) 
	{
		return value1 + value2;
	}

	public double substraction(double value1, double value2) 
	
	{
		return value1 - value2;
	}

	public double multiplication(double value1, double value2) 
	{
		return value1 * value2;
	}

	public double division(double value1, double value2) 
	{
		return value1 / value2;
	}

	public double remainder(double value1, double value2) 
	{
		return value1 % value2;
	}
}
