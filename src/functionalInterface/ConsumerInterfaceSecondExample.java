package functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceSecondExample {
	
	public static void main(String[] args) {
		
		List<Instructor> instructors = Instructors.getAll();
		//looping through all the instructor and printing out the values of instructor
		Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
		instructors.forEach(c1);
		
		//loop through all the instructor and only print out their name
		Consumer<Instructor> c2 = (s1) -> System.out.println(s1.getName());
		instructors.forEach(c2);
		
	}
}
