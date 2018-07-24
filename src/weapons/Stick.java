/**
 * ---------------------------------------------------------------------------
 * File name: Stick.java
 * Project name: weapons
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu, 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package weapons;


/**
 * Stick
 *
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>
 * @author Justin Adams
 */
public class Stick extends Weapon
{

	public Stick()
	{
		setDamagePoints (5);
	}//End Stick ( )

	/**
	 * Stick toString()         
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see weapons.Weapon#toString()
	 */
	@Override
	public String toString ( )
	{
		return "Stick";
	}//End toString ( )

}//End Stick ( )