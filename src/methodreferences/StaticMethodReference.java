/**
 * 
 */
package methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import predicateinterface.model.Person;

/**
 * @author Manav
 *
 */
public class StaticMethodReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		people.add(new Person("Watson", 65));
		
		// sorting the collection using StaticMethodReference
		Collections.sort(people, Person :: compareAges);
		
		people.forEach(p -> System.out.println(p));
	}

}
