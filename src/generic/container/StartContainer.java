package generic.container;

public class StartContainer {

	public static void main(String[] args) {
		Container<Integer> intContainer = new Container<Integer>();
		intContainer.addElement(5);
		intContainer.addElement(12);
		intContainer.addElement(25);
		System.out.println("Array integer is : \n"+intContainer);
		
		Container<Double> doubleCont = new Container<>();
		doubleCont.addElement(23.5);
		doubleCont.addElement(12.6);
		doubleCont.addElement(-45.7);
		System.out.println("Array Double is : \n"+doubleCont);
		doubleCont.removeElement(1);
		System.out.println("Array Double after removing is : \n"+doubleCont);
		
		Container<User> userCont = new Container<>();
		userCont.addElement(new User("Ivan", 34, 23.5));
		userCont.addElement(new User("John", 45, 123.6));
		System.out.println("Array User is :\n"+userCont);
		userCont.removeElement(0);
		System.out.println("Array User after removing : \n"+userCont);

	}

}
