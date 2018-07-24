package dag.ing.assignment;

import java.util.LinkedList;
import java.util.List;
/** 
 * The purpose of Directed Acyclic Graph (DAG) program is to identify correctly, the descendant of the Animal and the reptiles family.
 * @author Sandeep Kumar Shukla
 * @version 1.0
 * @since   24-Jul-2018 
 */
public class DAG {
	
	private List<String> dagList =  new LinkedList(); // Holds the ancestor and descendant relationship
	private static final String  MAMMALS="Mammals";
	private static final String REPTILES="Reptiles";

	/** The valid ancestor and descendant relationship is added using this the method. The method add the valid relationship in list.
	 * @param ancestor is the Origin from which one is descended
	 * @param decendent is the one which is inherited from ancestor
	 * @throws IllegalArgumentException is thrown if ancestor and descendant relationship chosen is not valid.
	 */
	public void put(final String ancestor,final String descendant)
	{
		
		Animal animal = null; 
		
		// verify and make sure that only valid ancestor are sent as parameter
		if((!ancestor.equalsIgnoreCase("Animal") ) && (!ancestor.equalsIgnoreCase(DAG.MAMMALS)) && (!ancestor.equalsIgnoreCase(DAG.REPTILES)) )
		{
			throw new IllegalArgumentException("Not a Valid ancestor");
		}
		// verify and make sure that Ancestor and decendant are not empty
		else if(ancestor.isEmpty() || descendant.isEmpty()) 
		{
			throw new IllegalArgumentException("Ancestor or Descendant cannot be empty :");
			 
		}
		 // Mammals can be ancestor to CAT,DOG and also can be descendant to Animal origin
		else if(ancestor.equalsIgnoreCase(DAG.MAMMALS) || descendant.equalsIgnoreCase(DAG.MAMMALS))
		{
			animal = new Mammals();
			boolean isDesendant= animal.isDesendant(ancestor, descendant);
			if(isDesendant)
			{
				
				dagList.add(ancestor.concat(":").concat(descendant));
				
			}
			else
			{
				throw new IllegalArgumentException("Ancestor or Descendant relation not valid :");
			}
		}
		 // Mammals can be ancestor to Lizard,Crocodile etc and also can be descendant to Animal origin. The below code block can be reused and that will be taken care while refactoring of the code.

		else if(ancestor.equalsIgnoreCase(DAG.REPTILES) || descendant.equalsIgnoreCase(DAG.REPTILES))
		{
			animal = new Reptiles();
			boolean isDesendant= animal.isDesendant(ancestor, descendant);

			if(isDesendant)
			{
				dagList.add(ancestor.concat(":").concat(descendant));
			}
			else
			{
				throw new IllegalArgumentException("Ancestor or Descendant relation not valid :");
			}
		}
		
		else
		{
			dagList.add(ancestor.concat(":").concat(descendant));
		}
	}

	/**
	 * @return list of the valid ancestor and descendant relationship.
	 */
	public List<String> getList()
	{
		return dagList;
	}
	

	
}
