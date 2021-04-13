package Topic5;
import javax.persistence.*;

@Table
@Entity
public class Car {
	
	Car(){}
	Car(String rno,String m, String c, String mf,int p){
		this.regno=rno;
		this.model=m;
		this.color=c;
		this.mf=mf;
		this.price=p;
	}
	
	@Id
	String regno;
	@Column
	String model;
	@Column 
	String color;
	@Column(name="manufacturer")
	String mf;
	@Column
	int price;
	
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMf() {
		return mf;
	}
	public void setMf(String mf) {
		this.mf = mf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
