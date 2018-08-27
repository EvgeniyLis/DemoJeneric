package generic.classes;

import java.util.Comparator;

public class ComparatorGeneric<T extends Comparable<T>> implements Comparator<T> {
	
	private boolean upDown = true; // sort up
	
	public ComparatorGeneric(boolean upDown) {
		this.upDown = upDown;
	}

	@Override
	public int compare(T elem1, T elem2) {
		if (upDown) {
			return elem1.compareTo(elem2);
		}else {
			return elem2.compareTo(elem1);
		}
		
	}

}
