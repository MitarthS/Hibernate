package Topic3;
import javax.persistence.*;
import org.hibernate.annotations.CollectionOfElements;
import java.util.*;

@Entity
@Embeddable
public class Inner {
	
	@CollectionOfElements
	List<String> l;

	public List<String> getL() {
		return l;
	}

	public void setL(List<String> l) {
		this.l = l;
	}
	
}
