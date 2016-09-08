package seedu.addressbook.common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import seedu.addressbook.data.person.Printable;

/**
 * Utility methods
 */
public class Utils {

	/**
	 * Checks whether any of the given items are null.
	 */
	public static boolean isAnyNull(Object... items) {
		for (Object item : items) {
			if (item == null) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if every element in a collection are unique by
	 * {@link Object#equals(Object)}.
	 */
	public static boolean elementsAreUnique(Collection<?> items) {
		final Set<Object> testSet = new HashSet<>();
		for (Object item : items) {
			final boolean itemAlreadyExists = !testSet.add(item); // see Set
																	// documentation
			if (itemAlreadyExists) {
				return false;
			}
		}
		return true;
	}

	public String getPrintableString(Printable... printables) {
		StringBuilder _stringBuilder = new StringBuilder();
		for(int i =0; i <printables.length; i++){
			_stringBuilder.append(printables[i]);
			if(i <printables.length-1){
				_stringBuilder.append(", ");
			}
		}
		return _stringBuilder.toString();
	};
}
