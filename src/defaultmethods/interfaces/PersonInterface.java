/**
 * 
 */
package defaultmethods.interfaces;

import defaultmethods.model.Person;

/**
 * @author Manav
 *
 */
public interface PersonInterface {
	
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	default String getPersonInfo() {
		return getName() + " (" + getAge() + ")";
	}
	
	// Because its a static method, it cannot access the instance methods declared above.
	// So need to pass the Person object instance.
	static String getPersonInformation(Person p) {
		return p.getName() + " (" + p.getAge() + ")";
	}

}
