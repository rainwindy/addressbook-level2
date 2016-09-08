package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {

		
		String isAdd;
		Person _person;
		Tag _tag;
		
		
		public Tagging(boolean isAdd, Person _person, Tag tag){
			this._person = _person;
			this._tag = tag;
			if(isAdd){
				this.isAdd = "+";
			}
			else
				this.isAdd = "-";
		}
		
		public String toString(){
			return isAdd + " " + _person.toString() + " " + _tag.toString();
		}
	
}
