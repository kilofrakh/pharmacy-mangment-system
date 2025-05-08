import java.util.Date;

public class Medicine {
    private String medicineId; // ID bta3 el dawa
    private String name; // Esm el dawa
    private String category; // Category bta3 el dawa
    private double price; // El se3r bta3 el dawa
    private int stockQuantity; // El 3adad el mawgod mn el dawa
    private Date expiryDate; // Tareekh el entaha bta3 el dawa

    public Medicine(String medicineId, String name, String category, double price, int stockQuantity, Date expiryDate) {
        this.medicineId = medicineId; // 7ot el ID
        this.name = name; // 7ot el esm
        this.category = category; // 7ot el category
        this.price = price; // 7ot el se3r
        this.stockQuantity = stockQuantity; // 7ot el 3adad
        this.expiryDate = expiryDate; // 7ot tareekh el entaha
    }

    public boolean isExpired() {
        return new Date().after(expiryDate); // Shoof law el dawa entaha
    }

    public void reduceStock(int quantity) {
        stockQuantity -= quantity; // Na2es el 3adad mn el stock
    }

    public void increaseStock(int quantity) {
        stockQuantity += quantity; // Zawed el 3adad fel stock
    }

    public String getName() {
        return name; // Gyb esm el dawa
    }

    public double getPrice() {
        return price; // Gyb se3r el dawa
    }

    public int getStockQuantity() {
        return stockQuantity; // Gyb el 3adad el mawgod mn el dawa
    }
}
