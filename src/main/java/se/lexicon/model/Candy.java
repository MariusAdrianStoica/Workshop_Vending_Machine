package se.lexicon.model;

public class Candy implements IProduct {
//Fields
    private final int id;
    private String candyName;
    double price;

    private boolean hasSugar;
//constructor
    public Candy(int id, String candyName, double price, boolean hasSugar) {
        this.id =id;
        this.candyName=candyName;
        this.price=price;
        this.hasSugar = hasSugar;

    }
//Getters & Setters
    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar, String productName, double price) {
        this.hasSugar = hasSugar;
        setProductName(productName);
        setPrice(price);
    }
    //Methods
    @Override
    public String examine() {
        return "{ id: "+id+ " Product: "+ candyName+" has sugar :" + hasSugar;
    }

    @Override
    public String use() {
        String description = "You taste some :" +candyName;
        return description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return candyName;
    }

    @Override
    public void setProductName(String productName) {
    this.candyName=candyName;
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
