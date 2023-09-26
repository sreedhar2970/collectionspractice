package sorting;

import java.util.Comparator;

public class SortingBasedOnAccnum implements Comparator<SavingAcount>{

	@Override
	public int compare(SavingAcount s1, SavingAcount s2) {
		if(s1.getAcc_num()<s2.getAcc_num())
			return 1;
		else if(s1.getAcc_num()>s2.getAcc_num())
			return -1;
		else 
			return 0;   			
	}
	
	}


