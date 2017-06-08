import junit.runner.Version;

import java.util.List;

public class Shop {

	public final List<ItemInShop> listofItems; 

	public Shop(List<ItemInShop> listofItems) {
		this.listofItems = listofItems;
	}


	public void addProduct(ItemInShop bottleOfWater) {
	listofItems.add(bottleOfWater); 
	}
}
