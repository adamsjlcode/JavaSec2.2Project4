/**
 * ---------------------------------------------------------------------------
 * File name: Ghoul.java
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
 * Ghoul
 *
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>
 * @author Justin Adams
 */
public class Ghoul extends Monster
{
	
	private int bite = 2;	/** The bite. */
	
	final int MISSED = 0;	/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Ghoul ( )
	{
		setHealthPoints (13);
	}//End Ghoul()
	
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
			Driver.updateText("Ghoul Has Biten You");
			return bite;
		}
		else
			Driver.updateText("Ghoul Missed");
			return MISSED;
	}//End attack (int)
	
	/**
	 * Ghoul toString        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see monster.Monster#toString()
	 */
	@Override
	public String toString ( )
	{
		return "Ghoul";
	}//End toString ( )
	
}//End Ghoul
