package sorting;

public class SavingAcount {
	
	long acc_num;
	String acc_holder_name;
	String branch_name;
	double acc_balance;
	
	public SavingAcount(long acc_num, String acc_holder_name, String branch_name, double acc_balance) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.branch_name = branch_name;
		this.acc_balance = acc_balance;
	}

	public long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}
	public String getAcc_holder_name() {
		return acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	@Override
	public String toString() {
		return "SavingAcount [acc_num=" + acc_num + ", acc_holder_name=" + acc_holder_name + ", branch_name="
				+ branch_name + ", acc_balance=" + acc_balance + "]";
	}
	
}
