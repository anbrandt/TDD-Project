/**
 * Created by andrzej on 08.06.17.
 */
public class ItemInShop {
	private String nameOfTheItem;
	private int price;

	public ItemInShop(String nameOfTheItem, int price) {
		this.nameOfTheItem = nameOfTheItem;
		this.price = price;
	}

	public String getNameOfTheItem() {
		return nameOfTheItem;
	}

	public int getPrice() {
		return price;
	}


}
