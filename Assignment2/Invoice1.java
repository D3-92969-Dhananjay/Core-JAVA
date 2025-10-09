package assignment_2;

class Invoice {
    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        
        // Validate quantity and price
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    // Getter and Setter methods
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    // Method to calculate total invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}


public class Invoice1{
    public static void main(String[] args) {
        // Create invoice objects
        Invoice item1 = new Invoice("A101", "Hammer", 5, 250.75);
        Invoice item2 = new Invoice("B205", "Screwdriver", -3, 120.50); // invalid quantity
        Invoice item3 = new Invoice("C309", "Drill Machine", 2, -850.00); // invalid price

        // Display details
        System.out.println("----- Invoice Details -----");
        displayInvoice(item1);
        displayInvoice(item2);
        displayInvoice(item3);
    }

    // Helper method to print invoice details
    public static void displayInvoice(Invoice inv) {
        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per Item: " + inv.getPricePerItem());
        System.out.println("Total Invoice Amount: " + inv.getInvoiceAmount());
        System.out.println("---------------------------");
    }
}

