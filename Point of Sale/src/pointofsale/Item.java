/*
 * Created: 11-15-2016
 * Programmer: Ian James Fannon
 * A program to simulate a point of sale system to calculate the cost 
 * and purchase of a certain amount of products.
 */
package pointofsale;

import java.util.ArrayList;

/**
 * @author Ian James Fannon
 */
public interface Item {

    /**
     * The variable constant bulk_quantity is the percentage that is 
     * given every two items purchased.
     * 
     * The variable constant total_discount_percent is the discount that is 
     * given for all items every purchase.
     */
    final double BULK_QUANTITY_DISCOUNT = 0.02;
    final double TOTAL_DISCOUNT_PERCENT = 0.15;
    
    /**
     * A method for obtaining the input from the user both 
     * the item and the number of items.
     */
    public void salesInput();
    
    /**
     * A method for calculating and determining the item and it value.
     * @param selectedItem is the item that was selected by the user.
     * @param numberItemsSold is the number of items that was selected by the user.
     * @return the total cost of all the selected items.
     */
    public double Items(int selectedItem, ArrayList<Integer> numberItemsSold);
    
    /**
     * A method for calculating the discount cost of the selected items.
     * @param prices contains the prices of the items
     * @param numberOfItemsSold contains the number of items sold;
     * @param total contains the total cost of all the items.
     * @return the total discounted cost of the selected items.
     */
    public double itemDiscount(ArrayList<Double> prices, ArrayList<Integer> numberOfItemsSold, double total);
    
    /**
     * A method for displaying the receipt for the items purchased.
     * @param fruit contains the string value of all the items.
     * @param prices contains the prices of all the items.
     * @param salesNumbers contains the cost of the amount of each item selected.
     * @param totalDiscountSales contain the total minus the discount.
     */
    public void displaySales(ArrayList<String> fruit, ArrayList<Double> prices, 
            ArrayList<Double> salesNumbers,  double totalDiscountSales);
}
