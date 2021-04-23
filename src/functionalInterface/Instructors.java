package functionalInterface;

import java.util.Arrays;
import java.util.List;

public class Instructors {

	public static List<Instructor> getAll(){
		Instructor instructor1 = new Instructor("Mike",10,"Software Developer","M",true,Arrays.asList("Java Programming","C++ programming","Python Programming"));
		Instructor instructor2 = new Instructor("Jenny",5,"Engineer","F",true,Arrays.asList("php Programming","C programming","Python Programming"));
		Instructor instructor3 = new Instructor("John",1,"Manager","M",true,Arrays.asList("Java Programming","C++ programming","Cobol Programming"));
		Instructor instructor4 = new Instructor("Carl",15,"Senior Developer","M",true,Arrays.asList("Java Programming","C++ programming","Unit Test"));
		Instructor instructor5 = new Instructor("Robert",6,"Senior Developer","M",true,Arrays.asList("Java Programming","Angular programming","React Programming"));
	
		List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
		return list;
	}
	
}
