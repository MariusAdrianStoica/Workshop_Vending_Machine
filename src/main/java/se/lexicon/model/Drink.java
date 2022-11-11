package se.lexicon.model;

public class Drink implements IProduct{
    //Fields
    private final int id;
    private String drinkName;
    private double price;
    private boolean hasAlcohol;

    //Constructor
    public Drink(int id, String drinkName, double price, boolean hasAlcohol){
        this.id = id;
        this.drinkName= drinkName;
        this.price=price;
        this.hasAlcohol = hasAlcohol;
    }

    // Getters & Setters

    public boolean isHasAlcohol() {
        return hasAlcohol;
    }

    public void setHasAlcohol(boolean hasAlcohol) {
        this.hasAlcohol = hasAlcohol;
    }

    //Methods
    @Override
    public String examine() {
        return "{ id: "+id+ " Product: "+ drinkName+" has alcohol :" + hasAlcohol;
    }

    @Override
    public String use() {
        return " You drink some :" + drinkName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return drinkName;
    }

    @Override
    public void setProductName(String productName) {
    this.drinkName=productName;
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
