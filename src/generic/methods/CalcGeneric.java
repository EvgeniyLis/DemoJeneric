package generic.methods;

public class CalcGeneric {
	
	public static <T extends Number> double getSum(T num1, T num2){
		return num1.doubleValue() + num2.doubleValue();
	} 
	
	public static <T extends Number> double getSubtr(T num1, T num2){
		return num1.doubleValue()-num2.doubleValue();
	}
	
	public static <T extends Number> double getMultiple(T num1, T num2) {
		return num1.doubleValue()*num2.doubleValue();
	}
	
	public static <T extends Number> double getDiv(T num1, T num2){
		return num1.doubleValue()/num2.doubleValue();
	}

	public static void main(String[] args) {
		int num1Int = 3, num2Int = 12;
		double num1Double = 34.5, num2Double = 12.4;
		System.out.println("Demo integer operations");
		System.out.println("Sum of integer is "+getSum(num1Int, num2Int));
		System.out.println("Subtr of integers is "+getSubtr(num1Int, num2Int));
		System.out.println("Multiple of integers is "+getMultiple(num1Int, num2Int));
		System.out.println("Dividing of integers is "+getDiv(num1Int, num2Int));
		System.out.println("Demo double operations");
		System.out.println("Sum of double is "+getSum(num1Double, num2Double));
		System.out.println("Subtr of double is "+getSubtr(num1Double, num2Double));
		System.out.println("Multiple of double is "+getMultiple(num1Double, num2Double));
		System.out.println("Dividing of double is "+getDiv(num1Double, num2Double));
		System.out.println("Demo integer-double");
		System.out.println(num1Int+num2Double);
		System.out.println(num1Double-num1Int);
		System.out.println(num1Int*num2Double);
		System.out.println(num2Double/num1Int);
	}

}
