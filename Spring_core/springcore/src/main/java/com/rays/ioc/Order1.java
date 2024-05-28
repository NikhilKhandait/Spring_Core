package com.rays.ioc;

public class Order1 {

	public Payment payment;
	public Inventory inventory;
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void booATicket(int items) {
		
		int price = 10;
		double totalAmount = items * price;
		
		double updatedBalance = payment.makePayment(totalAmount);

		int updatedStock = inventory.sold(items);
		
		System.out.println("Ticket Are Boocked");
		System.out.println("total amount paid" + totalAmount);
		System.out.println("Remaning balance" + updatedBalance);
		System.out.println("Updated stock" + updatedStock);

	}
}