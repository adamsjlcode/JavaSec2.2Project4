/**
 * ---------------------------------------------------------------------------
 * File name: Sword.java
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
 * Sword
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Sword extends Weapon
{
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Sword ( )
	{
		setDamagePoints (10);
	}//End Sword ( )
	
	/**
	 * Sword toString         
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
		return "Sword";
	}//End toString ( )
	
}//End Sword
