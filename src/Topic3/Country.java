package Topic3;
import javax.persistence.*;


@Embeddable
public class Country {
	
	@Column(name="Country")
	String con;

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}
	
}
