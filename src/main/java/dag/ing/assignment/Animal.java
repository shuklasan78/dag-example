package dag.ing.assignment;

/** The Animal interface is implemented by Mammals and Reptile desendant class. The method isDeswndant must be implemented by Mammals and Reptile class to identify the correct desendant.
 * @author Sandeep Kumar Shukla
 * @version 1.0
 * @since   23-Jul-2018 
 */
public interface Animal {
	
	public boolean isDesendant(String ancestor, String desendant);

}
