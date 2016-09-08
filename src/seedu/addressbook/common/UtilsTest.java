package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Phone;

public class UtilsTest {

	@Test
	public void test() {
		Object emptyObject = null;
		assertEquals(Utils.isAnyNull(emptyObject), true);
		
	}
	
	@Test
	public void testOne() {
		Object emptyObject = "Hello";
		assertEquals(Utils.isAnyNull(emptyObject), false);
		
	}
	
	@Test
	public void testTwo() throws IllegalValueException {
		ArrayList<Phone> testCollection = new ArrayList<Phone>();
		Phone num1 = new Phone("62353535", true);
		Phone num2 = new Phone("62353535", true);
		
		testCollection.add(num1);
		testCollection.add(num1);
		testCollection.add(num2);
		
		assertEquals(Utils.elementsAreUnique(testCollection), false);
		
	}

}
