package generic.calculator;

public class StartCalc {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int num1Int = 3, num2Int = 12;
		double num1Double = 34.5, num2Double = 12.4;
		@SuppressWarnings("rawtypes")
		Operation operation = new IntOperation();
		System.out.println("Demo integer operations");
		System.out.println("Sum of integer is "+operation.getSum(num1Int, num1Int));
		System.out.println("Subtr of integers is "+operation.getSubtr(num1Int, num2Int));
		System.out.println("Multiple of integers is "+operation.getMulti(num1Int, num2Int));
		System.out.println("Dividing of integers is "+operation.getDiv(num1Int, num2Int));
		
		operation = new DoubleOperation();
		System.out.println("Demo double operations");
		System.out.println("Sum of double is "+operation.getSum(num1Double, num2Double));
		System.out.println("Subtr of double is "+operation.getSubtr(num1Double, num2Double));
		System.out.println("Multiple of double is "+operation.getMulti(num1Double, num2Double));
		System.out.println("Dividing of double is "+operation.getDiv(num1Double, num2Double));

	}

}
