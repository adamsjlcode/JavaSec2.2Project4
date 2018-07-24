/**
 * ---------------------------------------------------------------------------
 * File name: Zork.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.ArrayList;

/**
 * Runs zork game
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Zork
{
	
	ArrayList<ArrayList<Room>> dungeon;	/** The dungeon. */
	
	Player player;						/** The player. */
	
	boolean ending;						/** The ending. */
	
	private int ROW = 0;				/** The row. */
	
	private int COL = 0;				/** The col. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 .
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Zork (int x, int y)
	{
		Room room;					//Temporary Room Object
		dungeon = new ArrayList<ArrayList<Room>>();
									//2-D Of Rooms
		player = new Player();		//Creates Player Object
		ending = false;				//Flag for exit 
		for (int i = 0; i < x; i++ )
		{
			ArrayList<Room> row = new ArrayList<Room>();
									//Row of Rooms
			dungeon.add (i, row);
			for (int j = 0; j < y; j++ )
			{
				if (i == 0 && j == 0)
				{
					room = new Room(player, null, null, false);
					row.add (j, room);
					continue;
				}
				room = new Room();
				
				if (i==x-1 && j==y-1)
				{
					room.setExit (true);
				}
				row.add (j, room);
			}//End for loop
		}//End for loop
	}//End Zork (int, int)


	
	/**
	 * Copy Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017 .
	 *
	 * @param dungeon the dungeon
	 */
	public Zork (ArrayList <ArrayList <Room>> dungeon)
	{
		for (int i = 0; i < dungeon.size ( ); i++ )
		{
			for (int j = 0; j < dungeon.get (i).size ( ); j++ )
			{
				this.dungeon.get (i).set (j, dungeon.get (i).get (j));
			}//End for loop
		}//End for loop
	}//End Zork (ArrayList <ArrayList <Room>>)
	
	
	/**
	 * Game over.
	 *
	 * @return the int
	 */
	public int gameOver()
	{
		int gameOver = 0;	//Determines if player has reach the end
		if (player.getHealthPoints ( ) < 1)
		{
			gameOver = 1;
		}
		if (player.getHealthPoints ( ) > 1 && ending)
		{
			gameOver = 2;
		}
		return gameOver;
	}//End gameOver()
	
	/**
	 * Move.
	 *
	 * @param move the move
	 * @throws Exception the exception
	 */
	public void move (String move) throws Exception
	{
		switch(move.toUpperCase ( ))
		{
		case "NORTH":
			player = dungeon.get (ROW).get (COL).getPlayer ( );
			ROW -= 1;
			try
			{
				dungeon.get (ROW).get (COL).setPlayer (player);
				dungeon.get (ROW+1).get (COL).setPlayer (null);
				if(dungeon.get (ROW).get (COL).exit)
				{
					ending = true;
				}
				
			}
			catch (IndexOutOfBoundsException e)
			{
				ROW += 1;
				dungeon.get (ROW).get (COL).setPlayer (player);
				Driver.updateText("You ran into a wall!");
			}
			break;
		case "SOUTH":
			player = dungeon.get (ROW).get (COL).getPlayer ( );
			ROW += 1;
			try
			{
				dungeon.get (ROW).get (COL).setPlayer (player);
				dungeon.get (ROW-1).get (COL).setPlayer (null);
				if(dungeon.get (ROW).get (COL).exit)
				{
					ending = true;
				}
			}
			catch (IndexOutOfBoundsException e)
			{
				ROW -= 1;
				dungeon.get (ROW).get (COL).setPlayer (player);
				Driver.updateText("You ran into a wall!");
			}
			break;
		case "EAST":
			player = dungeon.get (ROW).get (COL).getPlayer ( );
			COL += 1;
			try
			{
				dungeon.get (ROW).get (COL).setPlayer (player);
				dungeon.get (ROW).get (COL-1).setPlayer (null);
				if(dungeon.get (ROW).get (COL).exit)
				{
					ending = true;
				}
			}
			catch (IndexOutOfBoundsException e)
			{
				COL -= 1;
				dungeon.get (ROW).get (COL).setPlayer (player);
				Driver.updateText("You ran into a wall!");
			}
			break;
		case "WEST":
			player = dungeon.get (ROW).get (COL).getPlayer ( );
			COL -= 1;
			try
			{
				dungeon.get (ROW).get (COL).setPlayer (player);
				dungeon.get (ROW).get (COL+1).setPlayer (null);
				if(dungeon.get (ROW).get (COL).exit)
				{
					ending = true;
				}
				
			}
			catch (IndexOutOfBoundsException e)
			{
				COL += 1;
				dungeon.get (ROW).get (COL).setPlayer (player);
				Driver.updateText("You ran into a wall!");
			}
			break;
		default:
			{
				Driver.updateText ("I do not understand the direction.");
			}
		}//End switch
	}//End move ( )
	
	/**
	 * End.
	 *
	 * @param ending the ending
	 */
	public void end(boolean ending)
	{
		this.ending = ending;
	}//End end (boolean)

	
	/**
	 * ToString Method         
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
		String rooms = "";	//Place holder for string object
		for (Object element : dungeon) {
			ArrayList <Room> arrayList = (ArrayList <Room>) element;
											//Temporary Room Object
			Driver.updateText(arrayList.toString ( ));
		}//End for loop
		return String.format ("");
	}//End toString ( )
	
}//End Zork
