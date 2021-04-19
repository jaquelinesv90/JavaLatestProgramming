package functionalInterface;

import java.util.function.Consumer;

/* - Consumer interface is a part of the java.util.function package
 * - It represents a function which takes in one argument and produces a result.However
 * these kind of functions don't return any value.
 */

public class ConsumerInterface {
	
	public static void main(String[] args) {
		Consumer<String> c = (x) -> System.out.println(x.length() + "the value of x: "+ x);
		c.accept("up in the air");
		
		//Consumer with block statement
		Consumer<Integer> d = (x) -> {
			System.out.println("x*x = " + x*x);
			System.out.println("x/x = " + x/x);
		};
		d.accept(10);
	}

}
