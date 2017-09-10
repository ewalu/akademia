/**
 * 
 */
package pl.atena.edu.akademia1;

/**
 * @author ewalu1
 *
 */
public class Stringi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 50;
		
		String output1 = "Wiek " + age + " lat. " + age + 1 + (age+1);
		System.out.println(output1);
		String output2 = output1.substring(5, 10);
		System.out.println(output2);
		String output3 = String.join(" ", output1, output2);
		System.out.println(output3);
		
		String adam1 = "adam";
		String adam2 = "adam l998uhkh".substring(0,4);
		System.out.println(adam2);
		
		boolean test = adam1==adam2;
		System.out.println(test);
		
		boolean test1 = adam1.equals(adam2);
		System.out.println(test1);

	}

}
