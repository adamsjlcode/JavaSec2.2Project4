/**
 * ---------------------------------------------------------------------------
 * File name: Axe.java
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
 * Battleaxe
 *
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>
 * @author Justin Adams
 */
public class Battleaxe extends Weapon
{
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Battleaxe ( )
	{
		setDamagePoints (10);
	}//End Battleaxe ( )
	
	/**
	 * Battleaxe toString ( )
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
		return "Battleaxe";
	}//End toString ( )
	
}//End Battleaxe

