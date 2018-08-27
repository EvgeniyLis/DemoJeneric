package generic.calculator;

public interface Operation<T extends Number> {
	public T getSum(T num1, T num2);
	public T getSubtr(T num1, T num2);
	public T getMulti(T num1, T num2);
	public T getDiv(T num1, T num2);
}