package Topic4;
import java.util.*;
import javax.persistence.*;

import org.hibernate.annotations.CollectionOfElements;

@Entity
public class Department {
	@Id
	@GeneratedValue
	int id;
	String name;
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Employee.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "ID", referencedColumnName="ID")
	Collection<Employee> cc = new ArrayList<Employee>();
	
	public Collection<Employee> getCc() {
		return cc;
	}
	public void setCc(Collection<Employee> cc) {
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
