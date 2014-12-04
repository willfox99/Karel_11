/**
 * Creates a sequence of digits representing an ID number
 * Calls the display() method on each of the digits
 * 
 * @author Collins
 * @version 4 December, 2014
 *
 */

import edu.fcps.Digit;
import edu.fcps.karel2.Display; 

public class Lab11 {
	 
	 public static void main(String[] args) {
		 Display.setSize(36, 32);
		 Digit first = new Zero(1, 9);
		 Digit second = new Nine(7, 9);
		 Digit third = new Eight(13, 9);
		 Digit fourth = new Seven(19, 9);
		 Digit fifth = new Six(25, 9);
		 Digit sixth = new Five(1, 19);
		 Digit seventh = new Four(7, 19);
		 Digit eighth = new Three(13, 19);
		 Digit ninth = new Two(19, 19);
		 Digit tenth = new One(25, 19);
		 first.display();
		 second.display();
		 third.display();
		 fourth.display();
		 fifth.display();
		 sixth.display();
		 seventh.display();
		 eighth.display();
		 ninth.display();
		 tenth.display();	
	 }
	 
 }
