package seedu.addressbook.data.person;

import javax.swing.text.html.HTML.Tag;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.tag.Tagging;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+,.+,.+,.+";

    public final String value;
    public final Block _block;
    public final Street _street;
    public final Unit _unit;
    public final Postal _postal;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
        
        String[] valueArray = value.split(",");
        _block = new Block(valueArray[0]);
        _street =  new Street(valueArray[1]);
        _unit = new Unit(valueArray[2]);
        _postal = new Postal(valueArray[3]);
        
    }
    
    

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
   
    
    
}

