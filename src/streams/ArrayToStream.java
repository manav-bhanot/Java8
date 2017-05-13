/**
 * 
 */
package streams;

import java.util.Arrays;
import java.util.stream.Stream;

import streams.model.Person;

/**
 * @author Manav
 *
 */
public class ArrayToStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person[] people = new Person[] {
				new Person("Joe", 48),
				new Person("Mary", 30),
				new Person("Mike", 73),
				new Person("Watson", 65)
		};
		
		// 2 ways to create stream from arrays
		Stream<Person> stream = Stream.of(people);
		stream.forEach(p -> System.out.println(p.getInfo()));
		

		Stream<Person> peopleStream = Arrays.stream(people);
		peopleStream.forEach(p -> System.out.println(p.getInfo()));

	}

}
