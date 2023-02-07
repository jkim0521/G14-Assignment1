import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/** 
 * COMP 2503 Winter 2023 Assignment 1 
 * 
 * This program must read a input stream and keeps track of the 
 * frequency at which an avenger is mentioned either by name or alias.
 *
 * @author Maryam Elahi (for skeleton), Shaina Anne Garrido, Joseph Kim, and Kevin Luo
 * @date Winter 2023
*/

public class A1 {

	public String[][] avengerRoster = { { "captainamerica", "rogers" }, { "ironman", "stark" },
			{ "blackwidow", "romanoff" }, { "hulk", "banner" }, { "blackpanther", "tchalla" }, { "thor", "odinson" },
			{ "hawkeye", "barton" }, { "warmachine", "rhodes" }, { "spiderman", "parker" },
			{ "wintersoldier", "barnes" } };
	
	private int topN = 4;
	private int totalwordcount = 0;
	private ArrayList<Avenger> avengersArrayList = new ArrayList<>();

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.run();
	}

	/**
	 * This calls the readInput and printResults method
	 */
	public void run() {
		readInput();
		printResults();
	}

	/**
	 * read the input stream and keep track  
	 * how many times avengers are mentioned by alias or last name.
	 */
	private void readInput() {
		/*
		In a loop, while the scanner object has not reached end of stream,
		 	- read a word.
		 	- clean up the word
		    - if the word is not empty, add the word count. 
		    - Check if the word is either an avenger alias or last name then
				- Create a new avenger object with the corresponding alias and last name.
				- if this avenger has already been mentioned, increase the frequency count for the object already in the list.
				- if this avenger has not been mentioned before, add the newly created avenger to the list, remember to set the frequency.
		*/
		
//	    try {
//	        File myObj = new File("A1Starter Code and Sample Input Output/input2.txt");
//	        Scanner myReader = new Scanner(myObj);
//	        while (myReader.hasNextLine()) {
//	          String data = myReader.next().trim().toLowerCase().replaceAll("[',#.():\"0123456789_-]", "");
//	          System.out.println(data);
//	        }
//	        myReader.close();
//	      } catch (FileNotFoundException e) {
//	        System.out.println("An error occurred.");
//	        e.printStackTrace();
//	      }
//	}
		
			// File file = new File("A1Starter Code and Sample Input Output/input2.txt");
			Scanner reader = new Scanner(System.in);
			while (reader.hasNext()) {
				String text = reader.next().trim().toLowerCase().replaceAll("[',#.!/():\"0123456789_-]", "");
				if (text.isEmpty()) {
					continue;
				}
				totalwordcount += 1;
				for(String[] avengerName : avengerRoster) {
					if(text.equals(avengerName[0]) || text.equals(avengerName[1])) {
						Avenger currentAvenger = new Avenger(avengerName[0],avengerName[1]);
						avengersArrayList.add(currentAvenger);
						for(Avenger avenger:avengersArrayList) {
							System.out.println(avenger.equals(currentAvenger));
							}
						}
					}
				}
			reader.close();
	}

//	public void avenger

	/**
	 * print the results of the list and the order of the Avengers
	 */
	private void printResults() {
		
		System.out.println("Total number of words: " + totalwordcount);
		System.out.println("Number of Avengers Mentioned: " + avengersArrayList.size());
		System.out.println();

		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input
		// Make sure you follow the formatting example in the sample output
		for(Avenger avenger : avengersArrayList) {
			System.out.println(avenger.toString());
		}
		System.out.println();
		
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the most popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		System.out.println("Top " + topN + " least popular avengers:");
		// Todo: Print the least popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output		
		System.out.println();

		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		// Make sure you follow the formatting example in the sample output
		System.out.println();
	}
}
