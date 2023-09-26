package sorting;

public class Employee implements Comparable<Employee> {

	String name;
	int eid;
	Employee(String name, int eid) {
	this.name = name;
	this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public int compareTo(Employee o) {
		if(eid>o.eid) {
			return 1;
		}
		else if(eid<o.eid){
			return -1;
		}
		else
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}
}
