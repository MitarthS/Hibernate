package Topic6;
import javax.persistence.*;

@Entity
public class ContractEmployee extends Employee{
	int allw;

	public int getAllw() {
		return allw;
	}

	public void setAllw(int allw) {
		this.allw = allw;
	}
}
