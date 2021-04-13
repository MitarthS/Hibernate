package Topic3;
import javax.persistence.*;
import org.hibernate.annotations.CollectionOfElements;
import java.util.*;

@Entity @Table 
public class Question {
	@Id 
	int id;
	@Column(name="ques_name")
	String qname;
	@Column
	@CollectionOfElements
	List<String> options = new ArrayList<String>();
	String answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = (ArrayList<String>) options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
