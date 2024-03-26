package westview.ds;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public DriverHashmaps() {
		// TODO Auto-generated constructor stub
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
		HashMap covidData = new HashMap<HashMap<String, String>, HashMap<String, Integer>>();
		HashMap covidCityData = new HashMap<String,Integer>(); 
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
				int nCases = Integer.parseInt(cases);
				HashMap x = new HashMap<String, String>();
				HashMap y = new HashMap<String,Integer>();
				x.put(state,city);
				y.put(city,nCases);
				covidData.put(x,y);
			
			}
			//check to return a value for cases
			System.out.println(covidData.size());
			
			//try to get the sum of all cases for California
			
			
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
