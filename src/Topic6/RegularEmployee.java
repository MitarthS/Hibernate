package Topic6;
import javax.persistence.*;

@Entity
public class RegularEmployee extends Employee{
	int qplc;

	public int getQplc() {
		return qplc;
	}

	public void setQplc(int qplc) {
		this.qplc = qplc;
	}
}
