package generic.calc.varioustype;

public interface Operation<T1 extends Number, T2 extends Number> {
	public T2 getSum(T1 num1, T2 num2);
	public T2 getSubtr(T1 num1, T2 num2);
	public T2 getMulti(T1 num1, T2 num2);
	public T2 getDiv(T1 num1, T2 num2);
}
