package ex1;

import java.time.LocalDate;
import java.util.List;

public class Order {
	long id; 
	String status;
	LocalDate orderDate;
	LocalDate deliveryDate;
	Customer customer;
	List<Prod> products;
	
	public Order (long id,String status,LocalDate orderDate, LocalDate deliveryDate, Customer customer, List<Prod> products) {
		this.id =id;
		this.setStatus(status);
		this.setOrderDate(orderDate);
		this.setCustomer(customer);
	}
	
	
	public long getId(long id) {
		return this.id;
	}


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		 this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return this.deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		 this.deliveryDate = deliveryDate;
	}

	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
	 this.customer = customer;
	}

}
