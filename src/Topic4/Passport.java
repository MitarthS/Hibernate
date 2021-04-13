package Topic4;
import javax.persistence.*;

@Entity @Table
public class Passport {
	@Id
	@OneToOne
	@JoinColumn(name = "eid", referencedColumnName="eid")
	int eid;
	@Column
	String name;
	@Column(name="Pno")
	String pcode;
	public int getId() {
		return eid;
	}
	public void setId(int eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
}
