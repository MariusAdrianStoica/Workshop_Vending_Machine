package se.lexicon.model;

public class Cake implements IProduct{

    // Fields
    private final int id;
    private String cakeName;
    double price;

    boolean hasGluten;

    //Constructor
    public Cake(int id, String cakeName, double price, boolean hasGluten) {
        this.id = id;
        this.cakeName=cakeName;
        this.price= price;
        this.hasGluten = hasGluten;

    }

    //Getters & Setters


    public boolean isHasGluten() {
        return hasGluten;
    }

    public void setHasGluten(boolean hasGluten, String productName, double price) {
        this.hasGluten = hasGluten;
        setProductName(productName);
        setPrice(price);
    }

    //Methods
    @Override
    public String examine() {
        return "{ id: "+id+ " Product: "+ cakeName+" has gluten :" + hasGluten;
    }

    @Override
    public String use() {
        String description = "You taste some :" +cakeName;
        return description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return cakeName;
    }

    @Override
    public void setProductName(String productName) {
    this.cakeName = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
    this.price=price;
    }
}
