package labtask4;



public class InventoryItem {
    int serialNum;
    String description;
    double costPrice;
    double sellingPrice;
    int quantityInHand;
    
    public InventoryItem () {
        serialNum = 0;
        description = null;
        costPrice = 0.0;
        sellingPrice = 0.0;
        quantityInHand = 0;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantityInHand() {
        return quantityInHand;
    }

    public void setQuantityInHand(int quantityInHand) {
        this.quantityInHand = quantityInHand;
    }
    
    public double getTotalRevenue () {
        double revenue = (sellingPrice - costPrice) * quantityInHand;
        return revenue;
    }
    
}
