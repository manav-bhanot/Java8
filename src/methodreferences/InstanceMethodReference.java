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
public class InstanceMethodReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InstanceMethodReference mainClass = new InstanceMethodReference();
		mainClass.sortData();

	}

	private void sortData() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		people.add(new Person("Watson", 65));

		// sorting the collection using StaticMethodReference
		Collections.sort(people, this :: compareAges);

		people.forEach(p -> System.out.println(p));
	}

	public int compareAges(Person p1, Person p2) {
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}

}
