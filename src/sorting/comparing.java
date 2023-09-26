package sorting;

import java.util.ArrayList;
import java.util.Collections;


public class comparing {
		public static void main(String[] args) {
			ArrayList<Employee> t = new ArrayList<Employee>();
			
			t.add(new Employee("Nag", 100));
			t.add(new Employee("Bala", 200));
			t.add(new Employee("Chiru", 50));
			t.add(new Employee("Venki", 150));
			t.add(new Employee("Nag", 100));
			
			Collections.sort(t);
          for(Employee e :t) {
        	  System.out.println(e);
          }
          System.out.println("===========================");
          Collections.sort(t,new SortingbasedonName());
          for(Employee e : t) {
        	  System.out.println(e);
          }
	}

}
