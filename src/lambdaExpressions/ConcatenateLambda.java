package lambdaExpressions;

public class ConcatenateLambda {
	
	public static void main(String[] args) {
		ConcatenateInterface c  = (a,b) -> a + " " +b;
		System.out.println(c.sconcat("Hello", "World lambda"));
	}
}
