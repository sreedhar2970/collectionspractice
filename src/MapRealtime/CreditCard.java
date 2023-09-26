package MapRealtime;

public class CreditCard {
	
	long cc_number;
	String cc_holder_name;
	String bank_name;
	String expiry_date;
	int cvv_number;
	double credit_card_limit;
	
	public CreditCard(long cc_number, String cc_holder_name, String bank_name, String expiry_date, int cvv_number,
			double credit_card_limit) {
		super();
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.bank_name = bank_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.credit_card_limit = credit_card_limit;
	}

	public long getCc_number() {
		return cc_number;
	}

	public void setCc_number(long cc_number) {
		this.cc_number = cc_number;
	}

	public String getCc_holder_name() {
		return cc_holder_name;
	}

	public void setCc_holder_name(String cc_holder_name) {
		this.cc_holder_name = cc_holder_name;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public int getCvv_number() {
		return cvv_number;
	}

	public void setCvv_number(int cvv_number) {
		this.cvv_number = cvv_number;
	}

	public double getCredit_card_limit() {
		return credit_card_limit;
	}

	public void setCredit_card_limit(double credit_card_limit) {
		this.credit_card_limit = credit_card_limit;
	}

	@Override
	public String toString() {
		return "CreditCard [cc_number=" + cc_number + ", cc_holder_name=" + cc_holder_name + ", bank_name=" + bank_name
				+ ", expiry_date=" + expiry_date + ", cvv_number=" + cvv_number + ", credit_card_limit="
				+ credit_card_limit + "]";
	}

}
