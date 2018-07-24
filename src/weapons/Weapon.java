/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
 * Project name: weapons
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu, 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package weapons;


/**
 * Super Class
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Weapon
{
	
	protected String name;		/** The name. */
	
	protected int damagePoints;	/** The damage points. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 */
	public Weapon ( )
	{
		name = "";
		damagePoints = 0;
	}//End Weapon ( )

	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Apr 7, 2017 
	 *
	 * 
	 * @param name
	 * @param damagePoints
	 */
	public Weapon (String name, int damagePoints)
	{
		setName (name);
		setDamagePoints (damagePoints);
	}//End Weapon (String, int)


	/**
	 * Instantiates a new weapon.
	 *
	 * @param weapon the weapon
	 */
	public Weapon (Weapon weapon)
	{
		this.name = weapon.name;
		this.damagePoints = weapon.damagePoints;
	}//End Weapon (Weapon)


	/**
	 * Gets the name.
	 *
	 * @return name
	 */
	public String getName ( )
	{
		return name;
	}//End getName ( )

	
	/**
	 * Sets the weapons name.
	 *
	 * @param name the name to set
	 */
	public void setName (String name)
	{
		this.name = name;
	}//End setName (String)



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
	protected void setDamagePoints (int damagePoints)
	{
		this.damagePoints = damagePoints;
	}//End setDamagePoints (int)
	
	
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
		return getName();
	}//End toString ( )
	
}//End Weapon
