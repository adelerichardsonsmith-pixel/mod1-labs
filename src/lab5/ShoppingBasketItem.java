package lab5;

public class ShoppingBasketItem {
	
private String productName;
private int quantity;
private double price;

public ShoppingBasketItem(String productName, int quantity, double price){
	this.productName = productName;
	this.quantity = quantity;
	this.price = price;
}

 public String getDetails() {
	 return String.format("%d x %s @ £%.2f each", quantity, productName, price);
 }
	 
}
