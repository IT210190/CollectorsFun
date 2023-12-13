package htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
    @Test
    public void test_user_constructor(){
        User alfred = new User("Alfred", "Steiner");
        assertEquals("Alfred", alfred.getFirstname());
        assertEquals("Steiner", alfred.getLastname());
        assertEquals(0, alfred.getCollectionSize());
    }

    @Test
    public void test_user_add_collection(){
        User alfred = new User("Alfred", "Steiner");
        Collections collection = new Collections("Test");
        alfred.addCollection(collection);
        assertEquals(1, alfred.getCollectionSize());
    }

    @Test
    public void test_user_remove_collection(){
        User alfred = new User("Alfred", "Steiner");
        Collections collection = new Collections("Test");
        alfred.addCollection(collection);
        assertEquals(1, alfred.getCollectionSize());
        alfred.removeCollection(collection);
        assertEquals(0, alfred.getCollectionSize());
    }

    @Test
    public void test_user_get_collections(){
        User alfred = new User("Alfred", "Steiner");
        Collections collection = new Collections("Test");
        alfred.addCollection(collection);
        assertEquals(1, alfred.getCollections().size());
    }

    @Test
    public void test_user_get_collection_size(){
        User alfred = new User("Alfred", "Steiner");
        Collections collection = new Collections("Test");
        alfred.addCollection(collection);
        assertEquals(1, alfred.getCollectionSize());
    }

    @Test
    public void test_user_get_firstname(){
        User alfred = new User("Alfred", "Steiner");
        assertEquals("Alfred", alfred.getFirstname());
    }

    @Test
    public void test_user_get_lastname(){
        User alfred = new User("Alfred", "Steiner");
        assertEquals("Steiner", alfred.getLastname());
    }

    @Test
    public void test_user_to_string(){
        User alfred = new User("Alfred", "Steiner");
        assertEquals("User: Alfred, Steiner, 0 collections", alfred.toString());
    }
}
