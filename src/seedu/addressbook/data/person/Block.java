package seedu.addressbook.data.person;

public class Block {
	private String blockName ;
	
	public Block(String blockName){
		this.blockName =blockName;
	}
	//public void setBlockName(String blockName)
	
	public void setBlockName(String value){
		blockName = value;
	}
	public String getBlockName(){
		return blockName;
	}
		
}
