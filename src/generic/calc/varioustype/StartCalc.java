package generic.calc.varioustype;

public class StartCalc {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int num1Int = 34;
		double num2Double = 12.4;
		@SuppressWarnings({ "rawtypes", "unused" })
		Operation operation = new MultitypeOperation();
		System.out.println("Demo multitype operations");
		System.out.println("Sum of integer is "+operation.getSum(num1Int, num2Double));
		System.out.println("Subtr of integers is "+operation.getSubtr(num1Int, num2Double));
		System.out.println("Multiple of integers is "+operation.getMulti(num1Int, num2Double));
		System.out.println("Dividing of integers is "+operation.getDiv(num1Int, num2Double));
	}

}
