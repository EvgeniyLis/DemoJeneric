package generic.container;

import java.util.Arrays;

public class Container<T> {
	T[] elements;
	
	public int getSize() {
		return elements==null ? 0 : elements.length;
	}
	
	@SuppressWarnings("unchecked")
	public void addElement(T elem) {
		Object[] temp; // временный массив для помещения елементов любого типа
		if (getSize() >=1) {
			temp = new Object[getSize()+1];
			System.arraycopy(elements, 0, temp, 0, getSize()); // копирование старого массива в новый
			temp[getSize()] = elem; // записываем элемент на последнее место в массиве
		}else {
			temp = new Object[1];
			temp[0] = elem;
		}
		elements = (T[])temp;
	}
	
	@SuppressWarnings("unchecked")
	public void removeElement(int removeIndex) {
		Object[] temp = null;
		if (getSize() > 1) {
			temp = new Object[getSize()-1];
			System.arraycopy(elements, 0, temp, 0, removeIndex);
			System.arraycopy(elements, removeIndex+1, temp, removeIndex, getSize()-removeIndex-1);
		}else {
			elements = null;
		}
		elements = (T[])temp;
	}

	@Override
	public String toString() {
		String result = "";
		for (T elem : elements) {
			result+=elem+"\n";
		}
		return result;
	}
	
	
}
