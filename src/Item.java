import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Item implements JSONcompatible{
    private String id;
    private String name;
    private double price;
    private Type object;
    private LocalDate publication_Date;
    private String description;
    private Lenguage_Item lenguageItem;
    private int quantity;
    private String autohorOrCreator;
    private double rating;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Item(String name, double price, Type object, LocalDate publication_Date, String description, Lenguage_Item lenguageItem, int quantity, String autohorOrCreator) {
        this.name = name;
        this.price = price;
        this.object = object;
        this.publication_Date = publication_Date;
        this.description = description;
        this.lenguageItem = lenguageItem;
        this.quantity = quantity;
        this.autohorOrCreator = autohorOrCreator;
        this.id = UUID.randomUUID().toString();
        this.rating = 0;
        this.createdAt = LocalDateTime.now(); // timestamp actual
        this.updatedAt = LocalDateTime.now(); // timestamp actual
    }

    // toString
    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", object=" + object +
                ", publication_Date=" + publication_Date +
                ", description='" + description + '\'' +
                ", lenguageItem=" + lenguageItem +
                ", quantity=" + quantity +
                ", autohorOrCreator='" + autohorOrCreator + '\'' +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt;
    }

    // Convert to JSON
    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name", name);
        json.put("price", price);
        json.put("object", object.toString());
        json.put("publicationDate", publication_Date.toString());
        json.put("description", description);
        json.put("lenguageItem", lenguageItem.toString());
        json.put("quantity", quantity);
        json.put("authorOrCreator", autohorOrCreator);
        json.put("rating", rating);
        json.put("createdAt", createdAt.toString()); // Add createdAt timestamp
        json.put("updatedAt", updatedAt.toString()); // Add updatedAt timestamp
        return json;
    }


}
