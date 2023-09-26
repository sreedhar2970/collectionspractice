package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingusingComparator {

	public static void main(String[] args) {
		ArrayList<SavingAcount> listOfAccount = new ArrayList<SavingAcount>();
		listOfAccount.add(new SavingAcount(123456787l, "Amit", "Nagpur", 4100.0d));
		listOfAccount.add(new SavingAcount(123456786l,"Sheik","Chennai", 7000.0d));
		listOfAccount.add(new SavingAcount(123456789l, "Kamran", "Raichur", 4500.0d));
		listOfAccount.add(new SavingAcount(123456788l,"Manoj","Bangalore", 6050));
		listOfAccount.add(new SavingAcount(123456782l,"Roshni","Mumbai", 7500));
		listOfAccount.add(new SavingAcount(123456781l, "Maoranjan", "Kolkatta", 9000.0d));
		listOfAccount.add(new SavingAcount(123456777l,"Vamshee","Hyderabad", 10200.0d));
		listOfAccount.add(new SavingAcount(123456771l, "Ramesh", "Pune", 20000.0d));
		listOfAccount.add(new SavingAcount(123456774l,"Sai","Chennai", 16050));
		listOfAccount.add(new SavingAcount(123456742l, "Shubham", "Chandhigarh", 18640.0d));
		listOfAccount.add(new SavingAcount(123456634l,"Ajith","Mumbai", 22050));
		listOfAccount.add(new SavingAcount(123456785l, "Azhar", "Jharkand", 6500.0d));
		listOfAccount.add(new SavingAcount(123456784l,"Mohan","Hyderabad", 5500));
		listOfAccount.add(new SavingAcount(123456783l, "Subrat", "Odisha", 8700.0d));
System.out.println("sorting based on account baalance");
Collections.sort(listOfAccount, new SortingBasedOnAccBalance());
for(SavingAcount account : listOfAccount) {
	System.out.println(account);
	System.out.println("==============================");
}
Collections.sort(listOfAccount,new SortingBasedOnAccnum());
for(SavingAcount account :listOfAccount) {
	System.out.println(account);
}
	}

}
