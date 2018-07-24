/**
 * ---------------------------------------------------------------------------
 * File name: Vampire.java
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
 * Vampire
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Vampire extends Monster
{
	
	int slam = 5;		/** The slam. */
	
	int fastHeal = 2;	/** The fast heal. */
	
	int missed = 0;		/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Vampire ( )
	{
		setHealthPoints (29);	
	}//End Vampire ()
	
	/* (non-Javadoc)
	 * @see monster.Monster#attack(int)
	 */
	@Override
	public int attack(int pct)
	{
		if (pct>25)
		{
			Driver.updateText ("Vampire Has Slamed You");
			Driver.updateText ("Vampire Fasthealed Itself");
			healthPoints += fastHeal;
			return slam;
		}
		else
			Driver.updateText("Vampire Missed");
			Driver.updateText ("Vampire Fasthealed Itself");
			healthPoints += fastHeal;
			return missed;
	}//End attack(int)
	
	/**
	 * Vampire toString()         
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
		return "Vampire";
	}//End toString ( )
	
}//End Vampire ()
