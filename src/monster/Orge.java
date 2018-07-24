/**
 * ---------------------------------------------------------------------------
 * File name: Orge.java
 * Project name: monster
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu, 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package monster;

import zork.Driver;

/**
 * Orge Monster
 * 
 * <hr>
 * Date created:  Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Orge extends Monster
{
	
	private int greatclub = 8;	/** The greatclub. */
	
	final int MISSED = 0;		/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created:  Apr 7, 2017
	 */
	public Orge ( )
	{
		setHealthPoints (29);
	}//End Orge ( )
	
	/**
	 * Attack.
	 *
	 * @param pct the pct
	 * @return the int
	 */
	@Override
	public int attack(int pct)
	{
		if (pct>25)
		{
			Driver.updateText ("Orge hit you with a Greatclub");
			return greatclub;
		}
		else
			Driver.updateText("Orge Missed");
			return MISSED;
	}//End attack (int)
	
	/**
	 * Orge toString        
	 * 
	 * <hr>
	 * Date created:  Apr 7, 2017 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see monster.Monster#toString()
	 */
	@Override
	public String toString ( )
	{
		return "Orge";
	}//End toString ( )
	
}//End Orge
