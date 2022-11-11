package se.lexicon.data;


import se.lexicon.model.IProduct;

public interface IVendingMachine {

    void addCurrency(int amount);
    int getBalance();
    IProduct request(int id);
    int endSession();
    String getDescription(int id);
    String [] getProducts();
}
