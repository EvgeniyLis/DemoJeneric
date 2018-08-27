package generic.methods;

public class MinMaxArrayByJeneric {
	
	public static <T extends Comparable<T>> T getMax(T[] array) {
		T maximum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(maximum) > 0) {
				maximum = array[i];
			}
		}
		return maximum;
	}
	
	public static <T extends Comparable<T>> T getMin(T[] array) {
		T maximum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(maximum) < 0) {
				maximum = array[i];
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		Integer[] arrayInt = {4, -6, 7, -1};
		Integer maxInt = getMax(arrayInt);
		Integer minInt = getMin(arrayInt);
		System.out.println("Maximum element in Integer array is :"+maxInt);
		System.out.println("Minimum element in Integer  array is :"+minInt);
		
		Double[] arrayDouble = {-5.6, 3.6, -7.9};
		Double maxDouble = getMax(arrayDouble);
		Double minDouble = getMin(arrayDouble);
		System.out.println("Maximum element in Double array is :"+maxDouble);
		System.out.println("Minimum element in Double array is :"+minDouble);
		
		String[] arrayString = {"Ivan", "Petro", "Mikola"};
		String maxString = getMax(arrayString);
		String minString = getMin(arrayString);
		System.out.println("Maximum element in String array is :"+maxString);
		System.out.println("Minimum element in String array is :"+minString);
	}

}
