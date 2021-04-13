package Topic4;
import javax.persistence.*;
import java.util.*;

@Entity
public class Course {
	@Id
	int id;
	@Column
	String name;
	@ManyToMany
	Collection<Student> s = new ArrayList<Student>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Student> getS() {
		return s;
	}
	public void setS(Collection<Student> s) {
		this.s = s;
	}
	
}
