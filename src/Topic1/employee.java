package Topic1;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class employee {
	@Column(name="name")
	String name;
	@Id
	int empid;
	@Column(name="salary")
	int salary;
	@Column(name="designation")
	String design;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
