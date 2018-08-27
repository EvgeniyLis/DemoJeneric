package generic.methods;

public class FindMaxGeneric {
	
	// написать метод который надит максимум среди трёх переданных значений неизвестных заранее типов

	public static <T extends Comparable<T>> T getMax(T elem1, T elem2, T elem3) {
		T maximum=elem1;
		if (elem2.compareTo(maximum) > 0) {
			maximum = elem2;
		}
		if (elem3.compareTo(maximum) > 0) {
			maximum = elem3;
		}
		return maximum;
	}
	
	public static void main(String[] args) {
		Integer i1 = 3, i2 = -4, i3 = 6;
		Integer maxInt = getMax(i1, i2, i3);
		System.out.println(maxInt);
		
		Double d1 = -6.7, d2 = 45.6, d3 = 4.5; 
		Double maxDouble = getMax(d1, Double.parseDouble(i2.toString()), d3);
		System.out.println(maxDouble);
		
		String s1 = "Ivan", s2 = "Petro", s3 = "Konstantin";
		String maxString = getMax(s1, s2, s3);
		System.out.println(maxString);
	}

}
