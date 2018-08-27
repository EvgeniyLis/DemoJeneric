package generic.methods;

public class FindMinByJeneric {
	
	public static <T extends Comparable<T>> T getMinimum(T num1, T num2, T num3) {
		T minimum = num1;
		if (num2.compareTo(minimum) < 0) {
			minimum = num2;
		}
		if (num3.compareTo(minimum) < 0) {
			minimum = num3;
		}
		return minimum;
	}

	public static void main(String[] args) {
		
		Integer i1 = 3, i2 = -4, i3 = 6;
		Integer maxInt = getMinimum(i1, i2, i3);
		System.out.println("Minimum between "+i1+", "+i2+", "+i3+" is "+maxInt);
		
		Double d1 = -6.7, d2 = 45.6, d3 = 4.5; 
		Double maxDouble = getMinimum(d1, d2, d3);
		System.out.println("Minimum between "+d1+", "+d2+", "+d3+" is "+maxDouble);
		
		String s1 = "Ivan", s2 = "Petro", s3 = "Konstantin";
		String maxString = getMinimum(s1, s2, s3);
		System.out.println("Minimum between "+s1+", "+s2+", "+s3+" is "+maxString);

	}

}
