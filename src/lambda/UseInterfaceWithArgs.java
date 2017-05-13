/**
 * 
 */
package lambda;

import lambda.interfaces.InterfaceWithArgs;

/**
 * @author Manav
 *
 */
public class UseInterfaceWithArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InterfaceWithArgs obj = (v1, v2) -> {
			int result = v1 + v2;
			System.out.println("The resule is : " + result);
		};
		
		obj.calculate(10, 5);
	}

}
