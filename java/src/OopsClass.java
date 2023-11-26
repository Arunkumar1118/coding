class Calculator
{
	int a;
	public int  add(int n1, int n2)
	{
		int r = n1+n2;
		return r;
	}
}

public class OopsClass {

	public static void main(String[] args) 
	{
		int num1 = 20;
		int num2 = 10;
		
		Calculator calc = new Calculator();
		int result = calc.add(num2,num1);
		
		System.out.println(result);
	}

}
