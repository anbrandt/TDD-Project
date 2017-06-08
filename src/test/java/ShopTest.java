import org.assertj.core.api.ObjectAssert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ShopTest {

    private Shop shop;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shoulBeCreated(){
        shop = new Shop(null);
        assertThat(shop).isNotNull();
    }


    @Test
    public void shouldBeAbleToAddProductsToShop() {
        List<ItemInShop> listofItems = new ArrayList<ItemInShop>();
        shop = new Shop(listofItems);
        ItemInShop bottleOfWater = new ItemInShop("Bottle of Water", 2);

        shop.addProduct(bottleOfWater);

        assertThat(listofItems.get(0)).isNotNull();
    }
}