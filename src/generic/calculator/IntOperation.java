package generic.calculator;

public class IntOperation implements Operation<Integer> {

	@Override
	public Integer getSum(Integer num1, Integer num2) {
		return num1+num2;
	}

	@Override
	public Integer getSubtr(Integer num1, Integer num2) {
		return num1-num2;
	}

	@Override
	public Integer getMulti(Integer num1, Integer num2) {
		return num1*num2;
	}

	@Override
	public Integer getDiv(Integer num1, Integer num2) {
		return num1/num2;
	}
	
}
