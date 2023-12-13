package htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CollectionsTest {
    @Test
    public void test_collections_constructor(){
        Collections collection = new Collections("Test");
        assertEquals("Test", collection.getTitle());
        assertEquals("No description available", collection.getDescription());
        assertEquals(0, collection.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_collections_constructor_with_null_title(){
        Collections collection = new Collections(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_collections_constructor_with_empty_title(){
        Collections collection = new Collections("");
    }

    @Test
    public void test_collections_constructor_with_description(){
        Collections collection = new Collections("Test", "Description");
        assertEquals("Test", collection.getTitle());
        assertEquals("Description", collection.getDescription());
        assertEquals(0, collection.getSize());
    }

    @Test
    public void test_collections_add_item(){
        Collections collection = new Collections("Test");
        Item item = new Item("Test");
        collection.addItem(item);
        assertEquals(1, collection.getSize());
    }

    @Test
    public void test_collections_set_description(){
        Collections collection = new Collections("Test");
        collection.setDescription("Description");
        assertEquals("Description", collection.getDescription());
    }

    @Test
    public void test_collections_remove_item(){
        Collections collection = new Collections("Test");
        Item item = new Item("Test");
        collection.addItem(item);
        collection.removeItem(item);
        assertEquals(0, collection.getSize());
    }

    @Test
    public void test_collections_get_items(){
        Collections collection = new Collections("Test");
        Item item = new Item("Test");
        collection.addItem(item);
        assertEquals(1, collection.getItems().size());
    }

    @Test
    public void test_collections_get_size(){
        Collections collection = new Collections("Test");
        Item item = new Item("Test");
        collection.addItem(item);
        assertEquals(1, collection.getSize());
    }

    @Test
    public void test_collections_get_title(){
        Collections collection = new Collections("Test");
        assertEquals("Test", collection.getTitle());
    }

    @Test
    public void test_collections_to_string(){
        Collections collection = new Collections("Test");
        assertEquals("Collection: Test, No description available, 0 items", collection.toString());
    }
}
