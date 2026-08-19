package lab5;

import java.util.LinkedList;
import java.util.Queue;


public class Program {
	
	static Queue<ShoppingBasket> baskets = new LinkedList<>();

	public static void main(String[] args) {
		
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.add(new ShoppingBasketItem("Notepad",2,1.50));
		basket1.add(new ShoppingBasketItem("Pencil Case",5,3.00));
		
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.add(new ShoppingBasketItem("Cup",1,5.00));
		basket2.add(new ShoppingBasketItem("Coffee Grounds",6,9.00));
	}
	

}
