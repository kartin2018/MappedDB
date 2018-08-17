package kartin.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="productk")
public class Product {
	@Id
	@Column(name="pid")
	private String productId;
	@Column(name="pname")
	private String productName;
	@Column(name="pdescription")
	private String productDescription;
	@Column(name="pbrand")
	private String productBrand;
	@Column(name="price")
	private double productPrice;
	@Column(name="pimage1")
	private String productImage1;
	@Column(name="pimage2")
	private String productImage2;
	@Column(name="pimage3")
	private String productImage3;
	@Column(name="brandimage")
	private String brandImage;
	@ManyToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImage1() {
		return productImage1;
	}

	public void setProductImage1(String productImage1) {
		this.productImage1 = productImage1;
	}

	public String getProductImage2() {
		return productImage2;
	}

	public void setProductImage2(String productImage2) {
		this.productImage2 = productImage2;
	}

	public String getProductImage3() {
		return productImage3;
	}

	public void setProductImage3(String productImage3) {
		this.productImage3 = productImage3;
	}

	public String getBrandImage() {
		return brandImage;
	}

	public void setBrandImage(String brandImage) {
		this.brandImage = brandImage;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
