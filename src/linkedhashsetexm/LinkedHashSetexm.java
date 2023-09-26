package linkedhashsetexm;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetexm {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> setObject1 = new  LinkedHashSet<Integer>();
		setObject1.add(101);
		setObject1.add(103);
		setObject1.add(105);
		setObject1.add(102);
		setObject1.add(104);
		setObject1.add(102);
		setObject1.add(null);

		Iterator<Integer> itr = setObject1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		LinkedHashSet<Integer> setObject2 = new LinkedHashSet<Integer>();
		setObject2.add(106);
		setObject2.add(109);
		setObject2.add(108);
		setObject2.add(107);
		// adding new set Object(setObject2) to already existing set object(setObject1)
		System.out.println("======= using addAll(Collection obj) method ==========================");
		setObject1.addAll(setObject2);
		for(Integer number : setObject1) {
			System.out.println(number);
	}
		setObject1.remove(null);
		System.out.println(setObject1);
		setObject1.removeAll(setObject2);
		System.out.println(setObject1);
		System.out.println(setObject1.size());
		System.out.println(setObject1.isEmpty());
		System.out.println(setObject1.contains(105));
	}
}
