/**
 * ---------------------------------------------------------------------------
 * File name: Gargoyle.java
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
 * Gargoyle
 *
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>
 * @author Justin Adams
 */
public class Gargoyle extends Monster
{
	
	private int claw = 8;	/** The claw. */
	
	final int MISSED = 0;	/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Gargoyle ( )
	{
		setHealthPoints (37);
	}//End Gargoyle()
	
	/**
	 * Attack.
	 *
	 * @param pct the pct
	 * @return the int
	 */
	@Override
	public int attack(int pct)
	{
		if (pct<25)
		{
			Driver.updateText("Gargoyle Clawed You");
		return claw;
		}
		else
			Driver.updateText("Gargoyle Missed");
			return MISSED;
	}//End attack(int)
	
	/**
	 * Gargoyle toString        
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
		return "Gargoyle";
	}//End toString ( )
	
}//End Gargoyle
