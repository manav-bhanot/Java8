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
 *         In addition to the new lambda syntax, Java SE8 adds a number of new
 *         functional interfaces. One of the most useful is called the Predicate
 *         Interface. An interface that has a single boolean method named Test,
 *         that you can use to wrap up your conditional processing, and make
 *         conditional code a lot cleaner.
 */
public class PredicateInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		people.add(new Person("Watson", 65));
		
		System.out.println("Traversing the collection using for each ");

		System.out.println("Filtering the collection using the predicate interface\n");
		// Added the predicate interface that filters the people from the
		// persons collection based on the age.
		Predicate<Person> pred = new Predicate<Person>() {
			@Override
			public boolean test(Person p) {
				return (p.getAge() >= 65);
			}
		};

		System.out.println("Traversing the filtered collection using the lambda expression");
		people.forEach(p -> {
			if (pred.test(p)) {
				System.out.println(p);
			}
		});
	}

}
