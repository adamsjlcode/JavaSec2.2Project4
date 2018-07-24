/**
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: Project4
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package zork;

import weapons.Stick;
import weapons.Weapon;

/**
 * Player Object
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Player
{

	private int healthPoints;	/** The health points. */
	
	private Weapon weapon;		/** The weapon. */
	
	private final int MISSED = 0;	/** The missed. */
	
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Apr 7, 2017 
	 *
	 * 
	 */
	public Player ( )
	{
		healthPoints = 100;
		weapon = new Stick();
	}//End Player ( )
	
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 .
	 *
	 * @param healthPoints the health points
	 * @param weapon the weapon
	 */
	public Player (int healthPoints, Weapon weapon)
	{
		setHealthPoints (healthPoints);
		setWeapon (weapon);
	}//End Player (int, Weapon)
	
	
	/**
	 * Instantiates a new player.
	 *
	 * @param player the player
	 */
	public Player (Player player)
	{
		this.healthPoints = player.healthPoints;
		this.weapon = player.weapon;
	}//End Player (Player)

	
	/**
	 * Gets the health points.
	 *
	 * @return healthPoints
	 */
	public int getHealthPoints ( )
	{
		return healthPoints;
	}//End getHealthPoints ( )


	/**
	 * Sets the health points.
	 *
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints (int healthPoints)
	{
		this.healthPoints = healthPoints;
	}//End setHealthPoints (int)

	/**
	 * Player Weapon         
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 * 
	 * <hr>.
	 *
	 * @return the weapon
	 */
	public Weapon getWeapon ( )
	{
		return weapon;
	}//End getWeapon ( )
	
	/**
	 * Sets the weapon.
	 *
	 * @param weapon the weapon to set
	 */
	public void setWeapon (Weapon weapon)
	{
		this.weapon = weapon;
	}//End setWeapon (Weapon)


	/**
	 * Attacked.
	 *
	 * @param i the i
	 */
	public void attacked(int i)
	{
		healthPoints -= i;
	}//End attacked (int)
	
	
	/**
	 * Attack.
	 *
	 * @param i the i
	 * @param monster the monster
	 * @return the int
	 */
	public int attack(int i, String monster)
	{
		
		if (i > 24)
		{
			Driver.updateText("Player Hit The " + monster 
			+ " with the " + weapon.toString ( ));
			return weapon.getDamagePoints ( );
		}
		else
			Driver.updateText("Player Missed");
			return MISSED;
	}//End attack (int,String)
	
}//End Player
