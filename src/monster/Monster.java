/**
 * ---------------------------------------------------------------------------
 * File name: Monster.java
 * Project name: monster
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu, 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package monster;

/**
 * Super Class
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public abstract class Monster
{
	
	/** The health points. */
	int healthPoints;
	
	/** The damage points. */
	int damagePoints;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */	
	public Monster ( )
	{
		
	}//End Monster ( )
	
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
	 * Gets the damage points.
	 *
	 * @return damagePoints
	 */
	public int getDamagePoints ( )
	{
		return damagePoints;
	}//End getDamagePoints ( )
	
	/**
	 * Sets the damage points.
	 *
	 * @param damagePoints the damagePoints to set
	 */
	void setDamagePoints (int damagePoints)
	{
		this.damagePoints = damagePoints;
	}//End setDamagePoints (int)
	
	/**
	 * Attack.
	 *
	 * @param i the i
	 * @return the int
	 */
	public abstract int attack(int i);
	
	/**
	 * Monster gets attacked        
	 *
	 * <hr>
	 * Date created: Apr 7, 2017
	 *
	 * <hr>
	 * @param attack
	 */
	public void attacked (int attack)
	{
		healthPoints -= attack;
	}//End attacked (int)
	
	/**
	 * toString Method         
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return "M";
	}//End toString ( )

}//End Monster
