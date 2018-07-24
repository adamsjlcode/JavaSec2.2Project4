/**
 * ---------------------------------------------------------------------------
 * File name: Basilisk.java
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
 * Basilisk Monster
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Basilisk extends Monster
{
	
	private int bite = 8;	/** The bite. */
	
	final int MISSED = 0;	/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Basilisk ( )
	{
		setHealthPoints (45);
	}//End Basilisk()
	
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
			Driver.updateText ("Basilisk Has Biten You");
			return bite;
		}
		else
			Driver.updateText("Basilisk Missed");
			return MISSED;
	}//End attack(int)
	
	/**
	 * toString Method        
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
		return "Basilisk";
	}//End toString ( )
	
}//End Basilisk
