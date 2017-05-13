/**
 * 
 */
package lambda;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author Manav
 *
 */
public class TraverseCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
		
		// Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple Sort");
		
		// Traverse with for:each without using lambda
		System.out.println("Traversing with for:each without using lambda");
		for (String str : strings) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("Traversing using lambda operator");
		strings.forEach((str) -> System.out.println(str));
		
		
		// Case-insensitive sort with an anonymous class
		Comparator<String> comp = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(strings,comp);
		
		System.out.println("Sort with Comparator");
		
		System.out.println();
		
		System.out.println("Traversing with for:each without using lambda");
		// Traverse with iterator		
		Iterator<String> i = strings.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		System.out.println("Traversing using lambda operator");
		strings.forEach(str -> System.out.println(str));
	}
}
