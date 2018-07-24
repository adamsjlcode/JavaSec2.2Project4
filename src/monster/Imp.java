/**
 * ---------------------------------------------------------------------------
 * File name: Imp.java
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
 * Imp
 *
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>
 * @author Justin Adams
 */
public class Imp extends Monster
{
	
	private int sting = 8;	/** The sting. */
	
	final int MISSED = 0;	/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Imp ( )
	{
		setHealthPoints (13);
	}//End Imp ( )
	
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
			Driver.updateText("Imp Stung You");
			return sting;
		}
		else
			Driver.updateText("Imp Missed");
			return MISSED;
	}//End attack(int)
	
	/**
	 * Imp toString        
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
		return "Imp";
	}//End toString ( )
	
}//End Imp
