Java Functional Interfaces

- The term Java functional interface was introduced in Java 8
- A functional interface in Java is an interface that contains only a single abstract method which is unimplemented.
- A functional interface can contain default and static methods which do hava an implementation, in addition to the 
single unimplemented method.
example:

@FunctionalInterface
public interface MyFunctionalInterface{

	public void subString();//abstract method unimplemented
	
	//Before java 8, interface could have only abstract methods
	public default void print(String text){
		System.out.println(text);
	}
	
	public static void print(String text1,String text2){
		System.out.println(text1 + " "+ text2);
	}
}


- Annotate your functional interfaces with @FunctionalInterface.At first, this annotation seems to be useless.
Even without it, your interface will be treated as functional as long as it has just one abstract method.

Some of the useful java 8 functional interfaces are
- Consumer - DoubleConsumer, IntConsumer, LongConsumer, BiConsumer
- Supplier - IntPredicate, DoublePredicate and LongPredicate
- Function - Bifunction, UnaryOperator, BinaryOperator
- Predicate - IntPredicate, DoublePredicate, LongPredicate, BiPredicate
