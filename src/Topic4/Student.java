package Topic4;
import javax.persistence.*;
import java.util.*;

@Entity
public class Student {
	@Id
	int rollno;
	@Column
	String name;
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Course.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "x", referencedColumnName="x")
	Collection<Course> c = new ArrayList<Course>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Course> getC() {
		return c;
	}
	public void setC(Collection<Course> c) {
		this.c = c;
	}
	
	
}
