package kartin.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ordersk")
public class Orders {
	
	@Id
	private String orderId;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	@OneToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	private String paymentMode;
	
	private Date TStamp;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public User getuser() {
		return user;
	}

	public void setuser(User user) {
		this.user = user;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Date getTStamp() {
		return TStamp;
	}

	public void setTStamp(Date TStamp) {
		this.TStamp = TStamp;
	}

}
