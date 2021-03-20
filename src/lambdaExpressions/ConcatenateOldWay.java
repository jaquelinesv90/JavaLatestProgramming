package lambdaExpressions;

public class ConcatenateOldWay implements ConcatenateInterface{

	@Override
	public String sconcat(String a, String b) {
		return a + " " + b;
	}
	
	public static void main(String[] args) {
		ConcatenateOldWay c = new ConcatenateOldWay();
		System.out.println(c.sconcat("Hello","World"));
	}

}
