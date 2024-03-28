package westview.ds;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;



public class DriverHashmaps {
	private static HashMap<String, HashMap<String, Integer>> covidData = new HashMap<String,HashMap<String, Integer>>();	
	public DriverHashmaps() {
		// TODO Auto-generated constructor stub
		try {
			File f = new File("covid417.csv");
			Scanner s = new Scanner(f);
			s.nextLine();
			while (s.hasNext()) {
				String[] row = s.nextLine().split(",");
				String city = row[0].toLowerCase();
				String state = row[1].toLowerCase();
				String cases = row[2];
				int nCases = Integer.parseInt(cases);
				HashMap<String,Integer> y = new HashMap<String,Integer>();
				y.put(city,nCases);
				if (covidData.containsKey(state)) {
					covidData.get(state).put(city, nCases);
				}
				else {
					covidData.put(state, y);
				}
			
			}
			//check to return a value for cases + check to see if the covidData includes all of the values
			//System.out.println(covidData.size());
			
			//try to get the sum of all cases for California
			
			//try to get the cases for San Diego
			//getCityData("San Diego", "California");
			
			
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*HashMap m = new HashMap<String, String>();
		//let you name the indexes of something in an array
		//like a dictionary
		
		//adding entries to our map ("dictionary")
		m.put("nice", "mean");
		m.put("motivated", "Kavin");
		m.put("rich", "poor");
		
		//query the map for a non-existing key
		System.out.println(m.get("study"));
		
		//query the map for something that exists
		System.out.println(m.get("nice"));
		
		System.out.println(m.size());
		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pasta");
		food.add("Coffee");
		food.add("Cake");
		food.add("Boba");
		
		m2.put("Mr. David", food);
		
		System.out.println(m2.get("Mr. David"));*/
		
		//Get the scanner going to read the csv file
		//which should be outside the src folder
		DriverHashmaps d = new DriverHashmaps();
		
		//method for calculating the cases afflicted in the state/city chosen
		int sSum = 0;//initial store for the state data
		int cSum = 0; //initial store for the city data
		HashMap<String, Integer> temp = new HashMap<String, Integer>();//store the HashMap in the HashMap
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a state: ");
			String s = userInput.nextLine().toLowerCase();
			temp = covidData.get(s);
			if (temp == null) {
				System.out.println("not a real place. please input a real place");
				System.out.println("Enter a state: ");
				s = userInput.nextLine().toLowerCase();
				temp = covidData.get(s);
			}
			Collection<Integer> t = temp.values();
			Object[] ints = t.toArray();
			for (int i = 0; i < temp.size(); i++) {
				sSum+= (int) ints[i];
			}
			
			System.out.println("The total cases in the state of " + s + " is " +sSum);
			System.out.println();
			System.out.print("Enter a city: ");
			String c = userInput.nextLine().toLowerCase();
			if (covidData.get(s).get(c) == null) {
				System.out.println("not a real place. please input a real place");
				System.out.println("Enter a city: ");
				c = userInput.nextLine().toLowerCase();
			}
			cSum = (int) temp.get(c);
			System.out.println("The total cases in the city of " + c + " is " +cSum);
			System.out.println();
			System.out.println();
		}
		
		
		
	}
}
