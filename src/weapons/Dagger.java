/**
 * ---------------------------------------------------------------------------
 * File name: Dagger.java
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
 * Dagger
 *
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>
 * @author Justin Adams
 */
public class Dagger extends Weapon
{
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Dagger ( )
	{
		setDamagePoints (4);
	}//End Dagger ( )
	
	/**
	 * Dagger toString ( )
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
		return "Dagger";
	}//End toString ( )
	
}//End Dagger
