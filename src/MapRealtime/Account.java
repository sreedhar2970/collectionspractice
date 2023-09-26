package MapRealtime;

import java.util.List;

public class Account {

	long Acc_number;
	List<CreditCard> listOfCreditCards;
	
	public Account(long acc_number, List<CreditCard> listOfCreditCards) {
		super();
		Acc_number = acc_number;
		this.listOfCreditCards = listOfCreditCards;
	}

	@Override
	public String toString() {
		return "Account [Acc_number=" + Acc_number + ", listOfCreditCards=" + listOfCreditCards + "]";
	}

	
}
