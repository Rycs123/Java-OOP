package id.its.pbo;

public class Invoice {
    private String partNumber;    
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartDescription(){
        return this.partDescription;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public int getQuantity(){
        if(this.quantity < 0){
            return this.quantity = 0;
        }
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        if (this.price < 0){
            return this.price = 0.0;
        }
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getInvoiceAmount(){
        if(this.quantity < 0){
            return this.quantity = 0;
        }
        if (this.price < 0){
            return this.price = 0.0;
        }
        return (double) quantity * price;
    }


}
