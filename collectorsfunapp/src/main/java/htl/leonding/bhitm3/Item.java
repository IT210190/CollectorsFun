package htl.leonding.bhitm3;

public class Item {
    private String title;
    private String description;
    private String image;
    private final static String DEFAULT_DESCRIPTION = "No description available";

    public Item(String title) {
        this(title, DEFAULT_DESCRIPTION);
    }

    public Item(String title, String description) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title must not be null or empty");
        }
        this.title = title;
        setDescription(description);
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImage() {
        return this.image;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Item: %s, %s", this.title, this.description);
    }
}
