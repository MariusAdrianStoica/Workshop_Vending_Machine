package se.lexicon;

import se.lexicon.data.IVendingMachine;
import se.lexicon.data.VendingMachineImpl;
import se.lexicon.model.Cake;
import se.lexicon.model.Candy;
import se.lexicon.model.Drink;
import se.lexicon.model.IProduct;

public class App {
    public static void main( String[] args ){

        IProduct[] products ={
                new Cake(1, "Cake1", 199, true),
                new Cake(2,"Cake2", 249, false),
                new Candy(3,"Candy1", 39, true),
                new Candy(4, "Candy2", 29, false),
                new Drink(5, "Beer", 19, true),
                new Drink(6 , "Juice", 9, false)
                 };

        IVendingMachine vendingMachine= new VendingMachineImpl(products);

           for (String string : vendingMachine.getProducts()) {
               System.out.println(string);
               System.out.println("--------------------");
           }

           System.out.println("First balance is: "+vendingMachine.getBalance()+"\n");
           vendingMachine.addCurrency(500);
            System.out.println("Your balance after adding currency is: "+vendingMachine.getBalance()+"\n");

        IProduct candy =  vendingMachine.request(4);

        System.out.println(candy.use());
        System.out.println("Product price is: "+ candy.getPrice());
        System.out.println("Money left: " +vendingMachine.getBalance());
           }
    }
