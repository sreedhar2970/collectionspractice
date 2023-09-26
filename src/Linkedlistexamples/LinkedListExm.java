package Linkedlistexamples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExm {
	
	public static void main(String[] args) {
		
		LinkedList<String> listOfNames = new LinkedList<String>();
		
		listOfNames.add("Kamran");
		listOfNames.add("Amit");
		listOfNames.add("Sheik");
		listOfNames.add("Manoj");
		listOfNames.add("Vamshi");
		listOfNames.add("Ramesh");
		listOfNames.add("Roshni");
		listOfNames.add("Mohan");
		listOfNames.add("Azhar");
		listOfNames.add("Shubham");
		listOfNames.add("Sarawad");
		listOfNames.add("Subrat");
		listOfNames.add("Manoranjan");
		
		for(String s :listOfNames) {
			System.out.println(s);
		}
		System.out.println("================================");
		
		listOfNames.add(null);
		for(String s :listOfNames) {
			System.out.println(s);
		}
		System.out.println("================================");
		
		listOfNames.add("Sheik");
		System.out.println("================ after adding duplicate element traversing through linkedlist object =============");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		
		System.out.println("====================================================");
		LinkedList<String> listOfName = new LinkedList<String>();
		listOfName.add("rajesh");
		listOfName.add("kumar");
		listOfName.add("naveen");
		listOfNames.addAll(listOfName);
		for(String names : listOfNames) {
			System.out.println(names);
		}
		System.out.println("================================");
 
		LinkedList<String> listObject = new LinkedList<String>();
		listObject.add("Anish");
		listObject.add("Ashish");
		listObject.add("Rajan Raman");
		
		listOfNames.addAll(5,listObject);
		for(String names : listOfNames) {
			System.out.println(names);
		}
		System.out.println("================================");
		listOfNames.addFirst("pavan");
		listOfNames.addLast("servant");
		listOfNames.add(3,"guruji");
		listOfNames.set(4,"ananth");
		for(String names : listOfNames) {
			System.out.println(names);
		}
		System.out.println("=============================");
		System.out.println(listOfNames.contains("pavan"));
		listOfNames.remove("sheik");
		System.out.println(listOfNames);
		System.out.println("To get the element of specific index : " +listOfNames.get(5));
		System.out.println("To get the element of specific index : " +listOfNames.getFirst());
		System.out.println("To get the element of specific index : " +listOfNames.getLast());
		Iterator<String> itr = listOfNames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
