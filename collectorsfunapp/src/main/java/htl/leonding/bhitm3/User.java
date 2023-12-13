package htl.leonding.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String firstname;
    private String lastname;
    private List<Collections> collections;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.collections = new LinkedList<>();
    }

    public void addCollection(Collections collection) {
        this.collections.add(collection);
    }

    public List<Collections> getCollections() {
        return this.collections;
    }

    public int getCollectionSize() {
        return this.collections.size();
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void removeCollection(Collections collection) {
        this.collections.remove(collection);
    }

    @Override
    public String toString() {
        return String.format("User: %s, %s, %d collections", this.firstname, this.lastname, this.getCollectionSize());
    }
}
