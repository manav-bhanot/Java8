/**
 * 
 */
package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import predicateinterface.model.Person;

/**
 * @author Manav
 *
 */
public class SequentialStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		people.add(new Person("Watson", 65));

		Predicate<Person> pred = (p) -> p.getAge() >= 65;

		displayPeople(people, pred);

	}

	private static void displayPeople(List<Person> people, Predicate<Person> pred) {

		System.out.println("Selected:");

		// You call stream as a method
		// The items in the stream are of the same generic type as in the
		// collection
		people.stream().forEach(p -> System.out.println(p.getName()));

		// Now I will filter the items in the stream
		people.stream().filter(pred).forEach(p -> System.out.println(p));

	}

}
