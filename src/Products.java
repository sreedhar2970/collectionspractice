
public class Products implements Comparable<Products> {

	long product_id;
	String product_name;
	String product_features;
	double product_price;
	
	public Products(long product_id, String product_name, String product_features, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_features = product_features;
		this.product_price = product_price;
	}

	@Override
	public int compareTo(Products prod) {
		if(product_price>prod.product_price)
		return 1;
		else if(product_price<prod.product_price) 
			return -1;
		else
			return 0;
	}
	
	
	

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_features() {
		return product_features;
	}

	public void setProduct_features(String product_features) {
		this.product_features = product_features;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", product_features="
				+ product_features + ", product_price=" + product_price + "]";
	}
}
