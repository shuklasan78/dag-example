package dag.ing.assignment;
/** 
 * This class implements the Animal Interface and determines the desendant of the Reptiles family.
 * @author Sandeep Kumar Shukla
 * @version 1.0
 * @since   23-Jul-2018 
 *
 */
public class Reptiles implements Animal{

	private String lizard="Lizard";
	private String crocodile="Crocodile";
 

	/** The objective of method is to validate weather ancestor and descendant relationship is valid.
	 *  If method returns true then only the ancestor and descendant relationship can be added in the collection.
	 * @param ancestor is the Origin
	 * @param decendant is the one which is inherited from ancestor
	 * @return true if ancestor and descended relationship is valid else false is returned
	 */
	@Override
	public boolean isDesendant(String ancestor, String desendant) {
				 
		if(ancestor.equalsIgnoreCase("Animal") & desendant.equalsIgnoreCase("Reptiles"))
		{
			return true;
		}
		
		else if(ancestor.equalsIgnoreCase("Animal") || ancestor.equalsIgnoreCase("Reptiles"))
		{
			if(desendant.equalsIgnoreCase(this.lizard) || desendant.equalsIgnoreCase(this.crocodile))
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
