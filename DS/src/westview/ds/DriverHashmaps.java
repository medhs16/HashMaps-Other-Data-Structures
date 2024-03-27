package westview.ds;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class DriverHashmaps {
	private static HashMap<HashMap<String, String>, HashMap<String, Integer>> covidData = new HashMap<HashMap<String, String>, HashMap<String, Integer>>();
	private static ArrayList<String> cities = new ArrayList<String>();
	private static ArrayList<String> states = new ArrayList<String>();
	
	public DriverHashmaps() {
		// TODO Auto-generated constructor stub
		try {
			File f = new File("covid417.csv");
			Scanner s = new Scanner(f);
			s.nextLine();
			HashMap cityData = new HashMap<String, Integer>();
			while (s.hasNext()) {
				String[] row = s.nextLine().split(",");
				String city = row[0];
				String state = row[1];
				String cases = row[2];
				cities.add(city);
				states.add(state);
				int nCases = Integer.parseInt(cases);
				HashMap<String, String> x = new HashMap<String, String>();
				HashMap<String,Integer> y = new HashMap<String,Integer>();
				x.put(state,city);
				y.put(city,nCases);
				covidData.put(x,y);
			
			}
			//check to return a value for cases + check to see if the covidData includes all of the values
			System.out.println(covidData.size());
			System.out.println(covidData.keySet());
			
			//try to get the sum of all cases for California
			System.out.println(covidData.get("California"));
			
			System.out.println(covidData.values());
			
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
		d.getStateCases();
		
		
		
	}
	public int getStateCases() {
		int sum = 0;
		HashMap<String, String> temp = new HashMap<String, String>();
		//temp = (HashMap<String, String>) covidData.keySet();
		System.out.println(covidData.keySet().size());
		
		
		return sum;
	}
}
