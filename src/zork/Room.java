/**
 * ---------------------------------------------------------------------------
 * File name: Room.java
 * Project name: Project4
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.Random;

import monster.Basilisk;
import monster.Gargoyle;
import monster.Ghoul;
import monster.Gnome;
import monster.HumanSkeleton;
import monster.Imp;
import monster.Monster;
import monster.Orge;
import monster.Vampire;
import monster.WhiteDragon;
import monster.Zombie;
import weapons.Battleaxe;
import weapons.Dagger;
import weapons.DiamondSword;
import weapons.Sword;
import weapons.Weapon;

/**
 * Room 
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Room
{
	
	Player player;		//Holds player in room
	
	Random ran;			//Holds the chance of monster or treasure in the room
	
	Weapon weapon;		//Holds weapon in room
	
	Monster monster;	//Holds monster in room
	
	boolean exit;		//Holds if the room is the exit
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 .
	 */
	public Room ( )
	{
		ran = new Random();
		int iChance = ran.nextInt (100);
		if (iChance<25)
		{
			weapon = switchWeapon(ran.nextInt (100));
		}
		iChance = ran.nextInt (100);
		if (iChance<50)
		{
			monster = switchMonster (ran.nextInt (100));
		}
		exit = false;
	}//End Room ( )

	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 .
	 *
	 * @param player the player
	 * @param weapon the weapon
	 * @param monster the monster
	 * @param exit the exit
	 */
	public Room (Player player, Weapon weapon, Monster monster, boolean exit)
	{
		setPlayer (player);
		setWeapon (weapon);
		setMonster (monster);
		setExit (exit);
	}//End Room (Player, Weapon, Monster, boolean)

	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 .
	 *
	 * @param room the room
	 */
	public Room (Room room)
	{
		this.player = room.player;
		this.ran = room.ran;
		this.weapon = room.weapon;
		this.monster = room.monster;
		this.exit = room.exit;
	}//End Room (Room)

	/**
	 * Gets the player.
	 *
	 * @return player
	 */
	public Player getPlayer ( )
	{
		return player;
	}//End getPlayer ( )


	/**
	 * Sets the player.
	 *
	 * @param player the player to set
	 */
	public void setPlayer (Player player)
	{
		this.player = player;
		if (monster != null)
		{
			attack ( );
			if(this.player.getHealthPoints ( ) <=0)
			{
				return;
			}
		}
		if (weapon != null)
		{
			treasure ( );
		}
	}//End setPlayer (Player)


	/**
	 * Attack.
	 */
	private void attack ( )
	{
		
		Driver.updateText("You have enter a room with a monster");
		do
		{
			int pct;						//Holder random chance
			Random ran = new Random ( );	//Random object
			pct = ran.nextInt (100);
			player.attacked (monster.attack (pct));
			Driver.updateText(("Player Health: " + player.getHealthPoints ( )));
			pct = ran.nextInt (100);
			monster.attacked (player.attack(pct, monster.toString ( )));
			if (player.getHealthPoints ( ) <= 0)
			{
				Driver.updateText("Player is died");
				return;
			}			
			Driver.updateText((monster.toString ( )+ " Health: "
			+ monster.getHealthPoints ( )));
			if (monster.getHealthPoints ( ) <= 0)
			{
				Driver.updateText(monster + " is died");
				monster = null;
				return;
			}			
		}while (monster.getHealthPoints ( ) >= 0|| player.getHealthPoints ( ) >= 0);
	}//End attack ( )

	
	/**
	 * Treasure.
	 */
	public void treasure ( )
	{
		String input;
		Driver.updateText("You have enter a room with treasure");
		input = Driver.updateTextInput("Do you want to keep " + getWeapon( ));
		switch (input.toUpperCase ( ))
		{
			case "YES":
			{
				player.setWeapon (getWeapon());	
				setWeapon (null); 
			}
			case "NO":
			{
				Driver.updateText ("The treasure disappeared!");
				setWeapon (null);
				return;
			}
		}
	}//End treasure ( )
	
	
	/**
	 * Gets the weapon.
	 *
	 * @return weapon
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
	 * Gets the monster.
	 *
	 * @return monster
	 */
	public Monster getMonster ( )
	{
		return monster;
	}//End getMonster ( )


	/**
	 * Sets the monster.
	 *
	 * @param monster the monster to set
	 */
	public void setMonster (Monster monster)
	{
		this.monster = monster;
	}//End setMonster (Monster)


	/**
	 * Checks if is exit.
	 *
	 * @return exit
	 */
	public boolean isExit ( )
	{
		return exit;
	}//End isExit ( )


	
	/**
	 * Sets the exit.
	 *
	 * @param exit the exit to set
	 */
	public void setExit (boolean exit)
	{
		this.exit = exit;
	}//End setExit (boolean)
	
	/**
	 * Switch monster.
	 *
	 * @param chance the chance
	 * @return the monster
	 */
	public static Monster switchMonster(int chance)
	{
		Monster monster;	//Holds/Creates Monster Object
		if (chance<2)
		{
			monster = new WhiteDragon();
		}
		else if (chance>2&&chance<10)
		{
			monster = new Basilisk();
		}
		else if (chance>10&&chance<20)
		{
			monster = new Gargoyle();
		}
		else if (chance>20&&chance<30)
		{
			monster = new Vampire();
		}
		else if (chance>30&&chance<40)
		{
			monster = new Orge();
		}
		else if (chance>40&&chance<50)
		{
			monster = new Ghoul();
		}
		else if (chance>50&&chance<60)
		{
			monster = new Gnome();
		}
		else if (chance>60&&chance<75)
		{
			monster = new Zombie();
		}
		else if (chance>75&&chance<95)
		{
			monster = new HumanSkeleton();
		}
		else 
			monster = new Imp();
		return monster;
	}//End switchMonster (int)
	
	/**
	 * Switch weapon.
	 *
	 * @param chance the chance
	 * @return the weapon
	 */
	public static Weapon switchWeapon(int chance)
	{
		
		Weapon weapon = null; //Holds/Creates Weapon Object
			if(chance < 5)
			{
				weapon = new DiamondSword();
			}
			else if(chance < 11 && chance > 6)
			{
				weapon = new Sword();
			}
			
			else if(chance < 32 && chance > 12)
			{
				weapon = new Battleaxe();
			}
			else if(chance < 99 && chance > 33)
			{
				weapon = new Dagger();
			}
			return weapon;
	}//End switchWeapon(int)

	/**
	 * Override toString         
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
		String info= "";		//Holder for visible room
		if(player == null && monster == null && weapon == null)
		{
			info = ("|   |");
		}
		if(player != null && monster == null && weapon == null)
		{
			info = ("|P  |");
		}
		if(player != null && monster != null && weapon == null)
		{
			info = ("|PM |");
		}
		if(player != null && monster != null && weapon != null)
		{
			info = ("|PMT|");
		}
		if(player != null && monster == null && weapon != null)
		{
			info = ("|P  T|");
		}
		if(player == null && monster != null && weapon != null)
		{
			info = ("| MT|");
		}
		if(player == null && monster != null && weapon == null)
		{
			info = ("| M |");
		}
		if(player == null && monster == null && weapon != null)
		{
			info = ("|  T|");
		}
		return info;
	}//End toString ( )
	
}//End Room
