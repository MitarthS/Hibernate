package Topic4;
import javax.persistence.*;


@Entity
public class Employee {
	@Id
	int id;
	int did;
	@Column
	String name;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
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
	
}
