/**
 * 
 */
package lambda.UseBuiltInInterfaces;

/**
 * @author Manav
 *
 */
public class UseRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread 1");				
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread 2");				
			}
		};*/
		
		/**
		 * The amount of code is significantly reduced
		 * Lambda expressions can be used with either single line of code or block of multiple lines
		 */
		Runnable r1 = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Running Thread 1");	
		};
		Runnable r2 = () -> System.out.println("Running Thread 2");
		
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
