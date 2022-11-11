package se.lexicon.data;

import se.lexicon.model.IProduct;

public class VendingMachineImpl implements IVendingMachine {
    public static final int [] COINS = {1,2,5,10,50,100,200,500,1000 };
    private final  IProduct [] products;
    public int depositPool;
    //Amount  -amount;

    public VendingMachineImpl(IProduct[] products) {
        this.products = products;
    }


   public void addCurrency(int amount) {
        for (int coin : COINS) {
            if (coin == amount) {
                depositPool += amount;
            }
        }
    }
    public int getBalance() {
        return this.depositPool;
    }

    public IProduct request(int id) {
        for (IProduct product: products) {
            if (product.getId()==id){
                if (product.getPrice()<=depositPool){
                    depositPool=(int)(depositPool-product.getPrice());
                    return product;
                } else {
                    throw new RuntimeException("Product is too expensive. Please add money to deposit!");
                }
            }
        }

        throw new RuntimeException("Could not find product with id: "+ id);
    }

    public int endSession() {
        int tmp = this.depositPool;
        depositPool = 0;
        return tmp;
    }

    public String getDescription(int id) {
        String notFound = "Could not find product with id: "+ id;
        for (IProduct product: products) {
            if (product.getId() == id) {
                return product.examine();
            }
        }
        return notFound;
    }

    public String[] getProducts() {
        String [] productsAsString = new String[products.length] ;
        for (int i=0; i<productsAsString.length; i++){
            productsAsString[i]=products[i].examine();
        }
        return productsAsString;
    }

}
