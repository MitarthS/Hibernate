package Topic3;
import javax.persistence.*;

import org.hibernate.annotations.CollectionOfElements;

import java.util.*;

@Table
@Entity
public class Continent {
	@Id
	String cname;
	@Column
	@CollectionOfElements
	Map<Country,Capital> map;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<Country, Capital> getMap() {
		return map;
	}
	public void setMap(Map<Country, Capital> map) {
		this.map = map;
	}
	
}
