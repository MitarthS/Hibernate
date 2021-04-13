package Topic3;
import javax.persistence.*;

@Embeddable
public class Capital {
	
	@Column(name="Capital")
	String cap;

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}
}
