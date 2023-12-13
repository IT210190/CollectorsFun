package htl.leonding.bhitm3;

import java.util.HashSet;

public class Collections {
    private String title;
    private String description;
    private HashSet<Item> items;
    private static String DEFAULT_DESCRIPTION = "No description available";

    public Collections(String title) {
        this(title, DEFAULT_DESCRIPTION);
    }

    public Collections(String title, String description) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title must not be null or empty");
        }
        this.title = title;
        setDescription(description);
        this.items = new HashSet<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getDescription() {
        return this.description;
    }

    public HashSet<Item> getItems() {
        return this.items;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return this.items.size();
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    @Override
    public String toString() {
        return String.format("Collection: %s, %s, %d items", this.title, this.description, this.getSize());
    }
}
