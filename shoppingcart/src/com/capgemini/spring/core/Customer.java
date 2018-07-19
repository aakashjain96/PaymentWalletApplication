package com.capgemini.spring.core;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {

	private int customerId;
	private String customerName;
	private Address address;
	private List<Product> product;
	private Map<String,String> product_reviews; 
	



	public Map<String, String> getProduct_reviews() {
		return product_reviews;
	}


	public void setProduct_reviews(Map<String, String> product_reviews) {
		this.product_reviews = product_reviews;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}


	public void displayOrderedProduts()
	{
		System.out.println("ordered products\n");
		
		for (Product p : product) {
			System.out.println("product id: "+p.getProductId());
			System.out.println("product name: "+p.getProductName());
			System.out.println("product price: "+p.getProductPrice()+"\n");
		
		}
		
		System.out.println("Product_reviews");
		Set<String> s=product_reviews.keySet();
		Iterator<String> it=s.iterator();
		while (it.hasNext()) {
			String p = it.next();
			System.out.println(p+"-"+product_reviews.get(p));
		}
		
		/*System.out.println("product id: "+getProduct().getProductId());
		System.out.println("product name: "+getProduct().getProductName());
		System.out.println("product price: "+getProduct().getProductPrice());*/
		System.out.println("\nCustomer Address");
		System.out.println(getAddress().getCity()+" "+getAddress().getState()+" "+getAddress().getStreet());
	}
	
	
}
