/**
 * 
 */
package lambda.UseBuiltInInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Manav
 *
 */
public class UseComparator {

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
		for (String str : strings) {
			System.out.println(str);
		}
		
		// Case-insensitive sort with an anonymous class
		Comparator<String> comp = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(strings,comp);
		
		
		/*Collections.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});*/
		System.out.println("Sort with Comparator");
		for (String str : strings) {
			System.out.println(str);
		}
	}

}
