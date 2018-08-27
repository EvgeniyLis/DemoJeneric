package generic.container;

public class User {
	private String FIO;
	private int age;
	private double sallery;
	public String getFIO() {
		return FIO;
	}
	public User(String fIO, int age, double sallery) {
		super();
		FIO = fIO;
		this.age = age;
		this.sallery = sallery;
	}
	public void setFIO(String fIO) {
		FIO = fIO;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSallery() {
		return sallery;
	}
	public void setSallery(double sallery) {
		this.sallery = sallery;
	}
	@Override
	public String toString() {
		return "User [FIO=" + FIO + ", age=" + age + ", sallery=" + sallery + "]";
	}
	
	

}
