package se.lexicon.model;

public interface IProduct {

    String examine();

    String use();
    int getId();

    // Getters & Setters

    String getProductName();
    void setProductName(String productName);

    double getPrice();
    void setPrice(double price);

}
