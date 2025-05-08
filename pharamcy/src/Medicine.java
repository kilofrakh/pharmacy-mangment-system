import java.util.Date;


public class Medicine {
    private String medicineId;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;
    private Date expiryDate;

    public Medicine(String medicineId, String name, String category, double price, int stockQuantity, Date expiryDate) {
        this.medicineId = medicineId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.expiryDate = expiryDate;
    }

    public boolean isExpired() {
        return new Date().after(expiryDate);
    }

    public void reduceStock(int quantity) {
        stockQuantity -= quantity;
    }

    public void increaseStock(int quantity) {
        stockQuantity += quantity;
    }

    public String getName()
    {
        return name;
    } 
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
}
