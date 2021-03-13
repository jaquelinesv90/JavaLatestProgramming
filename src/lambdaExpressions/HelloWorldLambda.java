package lambdaExpressions;

public class HelloWorldLambda {
	
	// implementation using lambda
	public static void main(String[] args) {
		HelloWorldInterface h = () -> {
			return "hello world lambda";
		};
		
		System.out.println(h.sayHelloWorld());
	}

}
