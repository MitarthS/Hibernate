package Topic2;
import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	int empid;
	
	@Column(name="emp_name")
	String ename;
	
	@Column(name="emp_band")
	String eband;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEband() {
		return eband;
	}
	public void setEband(String eband) {
		this.eband = eband;
	}
	
}
