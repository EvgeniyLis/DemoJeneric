package generic.classes;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		Integer[] arrayInt = {3, -5, 6, 76};
		Double[] arrayDouble = {45.7, -5.6, 87.9};
		String[] arrayString = {"Petrov", "Ivanov", "Sidorov"};
		
		System.out.println("Integer Array before sorting :");
		outArray(arrayInt);
		Arrays.sort(arrayInt, new ComparatorGeneric<Integer>(false));
		System.out.println("Integer Array after sorting :");
		outArray(arrayInt);
		
		System.out.println("Double Array before sorting :");
		outArray(arrayDouble);
		Arrays.sort(arrayDouble, new ComparatorGeneric<Double>(false));
		System.out.println("Double Array after sorting :");
		outArray(arrayDouble);
		
		System.out.println("String Array before sorting :");
		outArray(arrayString);
		Arrays.sort(arrayString, new ComparatorGeneric<String>(false));
		System.out.println("String Array after sorting :");
		outArray(arrayString);
	}
	
	public static <T> void outArray(T[] arr) {
		for (T elem : arr) {
			System.out.println(elem);
		}
	}
	
	

}
