import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {


		ArrayList<String> listOfCities = new ArrayList<String>();
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
		
		listOfCities.add("Pune");
		listOfCities.add("Hyderabad");
		listOfCities.add("Bangalore");
		listOfCities.add("Mumbai");
		listOfCities.add(null);
		listOfCities.add("Chennai");
		listOfCities.add("Nagpur");
		listOfCities.add("Hyderabad");
		listOfCities.add("Chennai");
		listOfCities.add("Nagpur");
		listOfCities.add("Raichur");
		
		System.out.println(listOfCities);
		System.out.println("==============================================");
		listOfNumber.add(34);
		listOfNumber.add(null);
		listOfNumber.add(42);
		listOfNumber.add(23);
		listOfNumber.add(98);
		listOfNumber.add(45);
		listOfNumber.add(34);
		listOfNumber.add(23);
		listOfNumber.add(56);
		System.out.println(listOfNumber);
		
		listOfCities.add(4,"gadwal");
		//listofcities.add(5,"gadwal");
		System.out.println(listOfCities);
//		for(String city : listOfCities) {
//			System.out.println(city);
//		}
		
		for(String city :listOfCities) {
			System.out.println(city);
		}
	// adding new collection to the class file
		ArrayList<String> listOfNewCities = new ArrayList<String>();
		listOfNewCities.add("Raichur");
		listOfNewCities.add("Bidar");
		listOfNewCities.add("Gulburga");
		
		//adding list of new Cities to listofCities
		listOfCities.addAll(listOfNewCities);
		for(String newcities : listOfCities)
			System.out.println(newcities);
		System.out.println("to find the size of the list:"+listOfCities.size());
		
		listOfCities.set(8,"dharur");
		for(String city : listOfCities) {
			System.out.println(city);
		}
		System.out.println("whether the list is empty or not:"+listOfCities.isEmpty());
		System.out.println("size of list:"+listOfCities.size());
		listOfCities.removeAll(listOfNewCities);
		for(String cities : listOfCities) {
			System.out.println(cities);
			System.out.println(listOfCities.contains("gadwal"));
			System.out.println(listOfCities.contains("raichur"));
		}
		listOfCities.set(5,"gadwal");
		listOfCities.removeAll(listOfNewCities);
		System.out.println(listOfCities.contains("gadwal"));
		System.out.println(listOfCities.isEmpty());

	}

}
