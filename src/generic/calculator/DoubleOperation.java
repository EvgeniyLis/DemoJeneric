package generic.calculator;

public class DoubleOperation implements Operation<Double> {

	@Override
	public Double getSum(Double num1, Double num2) {
		return num1+num2;
	}

	@Override
	public Double getSubtr(Double num1, Double num2) {
		return num1-num2;
	}

	@Override
	public Double getMulti(Double num1, Double num2) {
		return num1*num2;
	}

	@Override
	public Double getDiv(Double num1, Double num2) {
		return num1/num2;
	}

}
