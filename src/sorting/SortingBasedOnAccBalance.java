package sorting;

import java.util.Comparator;

public class SortingBasedOnAccBalance implements Comparator<SavingAcount> {

	@Override
	public int compare(SavingAcount s1, SavingAcount s2) {
		if(s1.getAcc_balance()>s2.getAcc_balance()) 
			return -1;
		else if(s1.getAcc_balance()<s2.getAcc_balance())
			return 1;
		else 
			return 0;
	}

}
