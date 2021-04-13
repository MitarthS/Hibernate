package Topic1;
import javax.persistence.*;

@Entity
@Table(name="Product")
public class Product {
	@Column(name="Prod_name")
	String ProductName;
	@Id
	@Column(name="Prod_ID")
	int ProductId;
	@Column(name="Price")
	int Price;
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
}
