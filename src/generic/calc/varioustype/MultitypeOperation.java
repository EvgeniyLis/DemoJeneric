package generic.calc.varioustype;

public class MultitypeOperation implements Operation<Integer, Double> {

	@Override
	public Double getSum(Integer num1, Double num2) {
		return num1+num2;
	}

	@Override
	public Double getSubtr(Integer num1, Double num2) {
		return num1-num2;
	}

	@Override
	public Double getMulti(Integer num1, Double num2) {
		return num1*num2;
	}

	@Override
	public Double getDiv(Integer num1, Double num2) {
		return num1/num2;
	}

}
