package dag.ing.assignment;

/** 
 * This class implements the Animal Interface and determines the desendant of the Mammals family.
 * @author Sandeep Kumar Shukla
 * @version 1.0
 * @since   23-Jul-2018 
 *
 */
public class Mammals implements Animal {
	
	private String dog="Dog";
	private String cat="Cat";
	private String cow= "Cow";
	 
	/** The objective of method is to validate weather ancestor and descendant relationship is valid.
	 *  If method returns true then only the ancestor and descendant relationship can be added in the collection.
	 * @param ancestor is the Origin
	 * @param decendant is the one which is inherited from ancestor
	 * @return true if ancestor and descended relationship is valid else false is returned
	 */
	 @Override
	public boolean isDesendant(String ancestor, String desendant) {
		
		
		if(ancestor.equalsIgnoreCase("Animal") && desendant.equalsIgnoreCase("Mammals"))
		{
			return true;
		}
		
		else if(ancestor.equalsIgnoreCase("Animal") || ancestor.equalsIgnoreCase("Mammals"))
		{
			if(desendant.equalsIgnoreCase(this.dog) || desendant.equalsIgnoreCase(this.cat) || desendant.equalsIgnoreCase(this.cow))
			{
				return true;

			}
			else
			{
				return false;

			}
			
		}
		else
		{
			return false;
		}
		
	}
	
	

}
