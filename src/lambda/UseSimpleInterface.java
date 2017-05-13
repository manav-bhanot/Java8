/**
 * 
 */
package lambda;

import lambda.interfaces.SimpleInterface;

/**
 * @author Manav
 *
 */
public class UseSimpleInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();

	}

}
