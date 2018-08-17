import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import kartin.pojo.Cart;
import kartin.pojo.Orders;
import kartin.pojo.Product;
import kartin.pojo.User;
import kartin.util.HibernateUtil;

public class KartInTest {
//FOR ADDING PRODUCTS TO CART
@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Product p1=new Product();
		p1.setProductId("WW127");
		p1.setProductName("Fossil watch");
		p1.setProductDescription("a good watch");
		p1.setProductBrand("Fossil");
		p1.setProductPrice(9000);
		p1.setProductImage1(" ");
		p1.setProductImage2(" ");
		p1.setProductImage3(" ");
		p1.setProductBrand(" ");
		
		Cart c1 = (Cart) session.get(Cart.class, "C005");		
		p1.setCart(c1);
		
		
		session.save(p1);
		tx.commit();
	}
	//FOR ORDERS
	@Test
	public void testCase2() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Orders o1=new Orders();
		User u1=(User)session.get(User.class, "U005");
		Cart c1=(Cart)session.get(Cart.class, "C005");
		o1.setOrderId("OWW123");
		o1.setTStamp(new Date());
		o1.setPaymentMode("COD");
		o1.setuser(u1);
		o1.setCart(c1);
		session.save(o1);
	
		tx.commit();
	}
	//FOR MAKING CART
/*	@Test
	public void testCase3() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Cart c1=new Cart();
		
		//c1.setProductQty(1);
		
		User u1=new User();
		u1.getUserId();
		c1.setUser(u1);
		c1.setCartId("C005");
		Orders o1=new Orders();
		c1.setOrders(o1);
		session.save(c1);
		tx.commit();
	}*/
	//FOR MAKING USER
	@Test
	public void testCase4() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		User u1=new User();
		u1.setUserId("U005");
		u1.setUserName("Shivali");
		u1.setPassword("shi123");
		u1.setContact(90900090);
		u1.setUserEmail("shi@gmail.com");
		
		Cart c1=new Cart();
		c1.setCartId("C005");
		u1.setCart(c1);
		c1.setUser(u1);

		session.save(u1);
		session.save(c1);
		tx.commit();
	}
	
}
