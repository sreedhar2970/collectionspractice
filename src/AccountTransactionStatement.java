
public class AccountTransactionStatement {

	private long reference_num;
	private String payee_name;
	private String trans_date;
	private double amount;
	
	public AccountTransactionStatement(long reference_num, String payee_name, String trans_date, double amount) {
		super();
		this.reference_num = reference_num;
		this.payee_name = payee_name;
		this.trans_date = trans_date;
		this.amount = amount;
	}
	public long getReference_num() {
		return reference_num;
	}
	public void setReference_num(long reference_num) {
		this.reference_num = reference_num;
	}
	public String getPayee_name() {
		return payee_name;
	}
	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}
	public String getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ArrayListRealtime [reference_num=" + reference_num + ", payee_name=" + payee_name + ", trans_date="
				+ trans_date + ", amount=" + amount + "]";
	}
}
