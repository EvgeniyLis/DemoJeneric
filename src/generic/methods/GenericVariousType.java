package generic.methods;

public class GenericVariousType {
	
	//сравнение 2 разнотипных числа
	
	public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> T1 getMaximum(T1 elem1, T2 elem2) {
		T1 maximum = elem1;
		if (((T1)elem2).compareTo(maximum) > 0) {
			maximum = (T1)elem2;
		}
		return maximum;
	}

	public static void main(String[] args) {
		Integer num1 = 2;
		Double num2 = 3.4;
		Integer max = getMaximum(num1, num2);
		System.out.println(max);
	}

}
