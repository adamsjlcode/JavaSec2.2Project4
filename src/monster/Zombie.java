/**
 * ---------------------------------------------------------------------------
 * File name: Zombie.java
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
 * Zombie
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Zombie extends Monster
{
	
	int slam = 2;	/** The slam. */
	
	int missed = 0;	/** The missed. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Zombie ( )
	{
		setHealthPoints (16);
	}//End Zombie ( )
	
	/**
	 * Attack Player         
	 *
	 * <hr>
	 * Date created: Apr 7, 2017 
	 *
	 * <hr>
	 * @param pct
	 * @return
	 * @see Monster.Monster#attack(int)
	 */
	@Override
	public int attack(int pct)
	{
		if (pct>25)
		{
			Driver.updateText ("Zombie Has Slamed You");
			return slam;
		}
		else
			Driver.updateText("Zombie Missed");
		return missed;
	}//End attack (int)
	
	/**
	 * Zombie toString Method    
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
		return "Zombie";
	}//End toString ( )

}//End Zombie
