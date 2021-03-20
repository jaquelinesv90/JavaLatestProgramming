package lambdaExpressions;

public class HelloWorldLambda {
	
	// implementation using lambda
	public static void main(String[] args) {
		HelloWorldInterface h = () -> {
			return "hello world lambda";
		};
		
	//simplifying the above expression further	
		HelloWorldInterface hw = () -> "Hello world lambda2";
		
		System.out.println(h.sayHelloWorld());
	}

}
