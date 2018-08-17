package kartin.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "cartk")
public class Cart {
	@Id
	private String cartId;
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;
	//@OneToOne(mappedBy="cart")
	//private Orders orders;
	//private int productQty;
	
	@OneToMany(mappedBy="cart",cascade = {CascadeType.ALL })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Product> products=new HashSet<Product>();
	

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
*/
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}


	/*public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}*/

}
