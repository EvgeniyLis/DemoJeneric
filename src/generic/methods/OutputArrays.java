package generic.methods;

public class OutputArrays {

	// дано три массива разных типов, вывести их в консоль
	
	public static void main(String[] args) {
		Integer[] arrayInt = {2, 4, -54, 67};
		Double[] arrayDouble = {45.6, -54.7, 9.8};
		Character[] arrayChar = {'$', 'a', ';'};
		
		System.out.println("Output Integer Array : ");
		outArray(arrayInt);
		
		System.out.println("Output Double Array : ");
		outArray(arrayDouble);
		
		System.out.println("Output Character Array : ");
		outArray(arrayChar);
	}
	
	public static void outArray(Object[] array) {
		for (Object elem : array) {
			System.out.println(elem);
		}
	}

}
