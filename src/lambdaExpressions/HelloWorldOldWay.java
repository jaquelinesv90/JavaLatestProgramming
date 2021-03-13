package lambdaExpressions;

public class HelloWorldOldWay implements HelloWorldInterface{

	//implementation before java 8
	@Override
	public String sayHelloWorld() {
		return "Hello :)";
	}

	public static void main(String[] args) {
		HelloWorldOldWay h = new HelloWorldOldWay();
		System.out.println(h.sayHelloWorld());
	}
	
}
