/**
 * ---------------------------------------------------------------------------
 * File name: Driver.java
 * Project name: Project4
 * ---------------------------------------------------------------------------
 * Creator's name and email: 	Justin Adams, adamsjl3@etsu.edu 
 * 								Daniel Burchette, burchetted@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 7, 2017
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.Scanner;

/**
 * Driver for zork game
 * 
 * <hr>
 * Date created: Apr 7, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class Driver
{
	
	static final int row = 5;	/** The Constant row. */
	
	static final int col = 5;	/** The Constant col. */
	
	/**
	 * main method        
	 * 
	 * <hr>
	 * Date created: Apr 7, 2017
	 * 
	 * <hr>.
	 *
	 * @param args the arguments
	 */
	public static void main (String [ ] args)
	{
		welcome();									//Welcome Message
		Zork zork= new Zork(row,col);				//Creates number of 
													//rooms from parameters 
		Scanner kbInput = new Scanner (System.in);	//Keyboard Object
		while (zork.gameOver ( ) < 1)
		{
			
			updateText (zork.toString ( ));
			updateText ("Which Direction");
			String move = kbInput.nextLine ( );
			try
			{
				zork.move (move);
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//End while
		if (zork.gameOver ( ) == 1)
		{
			updateText ("\n\n*****Game Over*****");
		}
		if (zork.gameOver ( ) == 2)
		{
			updateText ("\n\n*****WINNER*****");
		}
	}//End main (String [ ])

	/**
	 * Update text.
	 *
	 * @param string the string
	 */
	public static void updateText (String string)
	{
		System.out.println (string);
	}//End updateText (String)
	
	/**
	 * Update text input.
	 *
	 * @param string the string
	 * @return the string
	 */
	public static String updateTextInput (String string)
	{
		Scanner kbInput = new Scanner(System.in);
		System.out.println (string);
		return kbInput.nextLine();
	}//End updateTextInput (String)

	/**
	 * Welcome.
	 */
	public static void welcome ( )
	{
		Scanner kb = new Scanner(System.in);	//Keyboard Object
		updateText ("Welcome to Zork!" +
						"\nIn this game you will placed into a dungeon where you can traverse North, South, East, or West." +
						"\nThe south east most cell contains the exit" +
						"\nAs you traverse this dungeon you may encounter monsters and/or find treasure!" +
						"\nMonsters will attack you on sight, but you will need to type Yes or No if you want the treasure in the room" +
						"\n\nThe adventures continues till you either die or find your way out of the dungeon." +
						"\nNow press enter and begin your adventure!");
		kb.nextLine ( );
		
	}//End welcome ( )

}//End Driver
