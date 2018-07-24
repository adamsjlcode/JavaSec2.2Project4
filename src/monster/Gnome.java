/**
 * ---------------------------------------------------------------------------
 * File name: Gnome.java
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
 * Gnome
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Gnome extends Monster
{
	
	private int crossbow = 1;	/** The claw. */
	
	final int MISSED = 0;		/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Gnome ( )
	{
		setHealthPoints (6);
	}//End Gnome ( )
	
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
			Driver.updateText("Gnome Use A Crossbow On You");
			return crossbow;
		}
		else
			Driver.updateText("Gnome Missed");
			return MISSED;
	}//End attack (int)
	
	/**
	 * Gnome toString        
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
		return "Gnome";
	}//End toString ( )
	
}//End Gnome