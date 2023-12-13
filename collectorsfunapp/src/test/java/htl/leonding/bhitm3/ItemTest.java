package htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ItemTest {
    @Test
    public void test_item_constructor(){
        Item item = new Item("Test");
        assertEquals("Test", item.getTitle());
        assertEquals("No description available", item.getDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_item_constructor_with_null_title(){
        Item item = new Item(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_item_constructor_with_empty_title(){
        Item item = new Item("");
    }

    @Test
    public void test_item_constructor_with_description(){
        Item item = new Item("Test", "Description");
        assertEquals("Test", item.getTitle());
        assertEquals("Description", item.getDescription());
        assertNull(item.getImage());
    }

    @Test
    public void test_item_set_description(){
        Item item = new Item("Test");
        item.setDescription("Description");
        assertEquals("Description", item.getDescription());
    }

    @Test
    public void test_item_set_image(){
        Item item = new Item("Test");
        item.setImage("Image");
        assertEquals("Image", item.getImage());
    }

    @Test
    public void test_item_to_string() {
        Item item = new Item("Test", "Description");
        assertEquals("Item: Test, Description", item.toString());
    }
}
