import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratingusinglist {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ramesh");
		list.add("10");
		list.add("abhi");
		list.add("naveen");
		list.add("kumar");
		list.add("revanth");
		System.out.println(list);
		
		System.out.println("=====================================");
		// using for each loop
		for(String name :list) {
			System.out.println(name);
		}
			System.out.println("===============================");
			
			// iteration using iterator
			
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
			}
			System.out.println("=======================");
			System.out.println("using the listIterator() method" );
			
			ListIterator<String> listiterator = list.listIterator();
			while(listiterator.hasNext()) {
				System.out.println(listiterator.next());
			}
		}

	}


