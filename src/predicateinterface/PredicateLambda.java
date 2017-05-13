/**
 * 
 */
package predicateinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import predicateinterface.model.Person;

/**
 * @author Manav
 *
 */
public class PredicateLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		people.add(new Person("Watson", 65));

		System.out.println("Used lambda expression for the predicate interface as it is also a funtional interface");
		Predicate<Person> predOlder = (p) -> p.getAge() >= 65;
		Predicate<Person> predYounger = (p) -> p.getAge() <= 60;

		// displayPeople(people, predOlder);
		displayPeople(people, predYounger);
	}

	private static void displayPeople(List<Person> people, Predicate<Person> pred) {
		people.forEach(p -> {
			if (pred.test(p)) {
				System.out.println(p);
			}
		});
	}

}
