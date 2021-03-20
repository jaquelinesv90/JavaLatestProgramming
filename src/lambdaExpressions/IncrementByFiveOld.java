package lambdaExpressions;

public class IncrementByFiveOld implements IncrementByFiveInterface{

	@Override
	public int incrementByFive(int a) {
		
		return  a + 5;
	}
	
	public static void main(String[] args) {
		IncrementByFiveOld value = new IncrementByFiveOld();
		System.out.println(value.incrementByFive(2));
	}

}
