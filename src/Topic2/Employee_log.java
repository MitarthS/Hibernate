package Topic2;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="Employee log table")
public class Employee_log {
	@Id
	Emp e;
	@Column(name="Leaving date")
	Date le = new Date();
	
	public Emp getE() {
		return e;
	}
	public void setE(Emp e) {
		this.e = e;
	}
	public Date getLe() {
		return le;
	}
	public void setLe(Date le) {
		this.le = le;
	}
}
