/*
 * Created: 11-15-2016
 * Programmer: Ian James Fannon
 * A program to simulate a point of sale system to calculate the cost 
 * and purchase of a certain amount of products.
 */
package pointofsale;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ian James Fannon
 */
public class Product implements Item{

    private ArrayList<Integer> numberItemsSold;
    private double totalDiscountSale;
    private double bulkDiscount;
    private int bulkQuantity;
    private ArrayList<Double> prices; 
    private ArrayList<String> fruit;
    private ArrayList<Double> salesNumbers;
    private NumberFormat format;
    private double total;
    private int selectedItem;
    
    /**
     * The constructor for initializing the variables.
     */
    public Product() {
        numberItemsSold = new ArrayList<>(10);
        totalDiscountSale = 0;
        bulkDiscount = 0;
        bulkQuantity = 0;
        total = 0;
        prices = new ArrayList<>();
        fruit = new ArrayList<>();
        salesNumbers = new ArrayList<>();
        format = NumberFormat.getCurrencyInstance();
        selectedItem = 0;
        
    }
    
    /**
     * An accessor method for getting the value.
     * @return the value of numberItemsSold.
     */
    public ArrayList<Integer> getNumberSold() {
        return numberItemsSold;
    }
    
    /**
     * An accessor method for getting the value.
     * @return the value of prices.
     */
    public ArrayList<Double> getPrices() {
        return prices;
    }
    
    /**
     * An accessor method for getting the value.
     * @return the value of fruit.
     */
    public ArrayList<String> getFruit() {
        return fruit;
    }
    
    /**
     * An accessor method for getting the value.
     * @return the value of salesNumbers.
     */
    public ArrayList<Double> getSalesNumbers() {
        return salesNumbers;
    }
    
    /**
     * An accessor method for getting the value.
     * @return the value of total.
     */
    public double getTotal() {
        return total;
    }
    
    /**
     * An accessor method for getting the value.
     * @return the value of totalDiscountSale.
     */
    public double getTotalDiscountSale() {
        return totalDiscountSale;
    }
    
    /**
     * A method for obtaining the input from the user both 
     * the item and the number of items.
     */
    @Override
    public void salesInput() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Fruit\t\t\tPrices");
            System.out.println("-------------------------------");
            int count = 0;
            for (Merchandise fruits : Merchandise.values()) {
                fruit.add(count, fruits.getDescription());
                prices.add(count, fruits.getPrice());
                ++count;
                System.out.println(count + ") " + fruits.getDescription() + "\t\t" + format.format(fruits.getPrice()));
            }
            for (int index = 0; index < 10; index++) {
                do {
                    System.out.print("Enter the number of the fruit you want to purchase (0 to skip item): ");
                    selectedItem = input.nextInt();
                    System.out.print("Enter the amount of the product want to purchase: ");
                    numberItemsSold.add(index, input.nextInt());
                    Items(selectedItem, numberItemsSold);
                } while (selectedItem < 0 && selectedItem > 10);
            }
        } catch (InputMismatchException | NumberFormatException | IndexOutOfBoundsException ex) {
            System.out.printf("Invalid input %s", ex.getMessage());
        }
    }
    
    /**
     * A method for calculating and determining the item and it value.
     * @param selectedItem is the item that was selected by the user.
     * @param numberItemsSold is the number of items that was selected by the user.
     * @return the total cost of all the selected items.
     */
    @Override
    public double Items(int selectedItem, ArrayList<Integer> numberItemsSold) {
        if (selectedItem == 0) {
            System.out.println("Item Skipped");
        }
        if (selectedItem == 1) {
            salesNumbers.add(0, numberItemsSold.get(0) * prices.get(0));
            total += numberItemsSold.get(0) * prices.get(0);
            System.out.println("You have purchased " + Merchandise.APPLES + " for " 
                    + format.format(numberItemsSold.get(0) * prices.get(0)));
        }
        if (selectedItem == 2) {
            salesNumbers.add(1, numberItemsSold.get(1) * prices.get(1));
            total += numberItemsSold.get(1) * prices.get(1);
            System.out.println("You have purchased " + Merchandise.BANANAS + " for " 
                    + format.format(numberItemsSold.get(1) * prices.get(1)));
        }
        if (selectedItem == 3) {  
            salesNumbers.add(2, numberItemsSold.get(2) * prices.get(2));
            total += numberItemsSold.get(2) * prices.get(2);
            System.out.println("You have purchased " + Merchandise.BLACKBERRIES + " for " 
                    + format.format(numberItemsSold.get(2) * prices.get(2)));
        }
        if (selectedItem == 4) {
            salesNumbers.add(3, numberItemsSold.get(3) * prices.get(3));
            total += numberItemsSold.get(3) * prices.get(3);
            System.out.println("You have purchased " + Merchandise.BLUEBERRIES + " for " 
                    + format.format(numberItemsSold.get(3) * prices.get(3)));
        }
        if (selectedItem == 5) {
            salesNumbers.add(4, numberItemsSold.get(4) * prices.get(4));
            total += numberItemsSold.get(4) * prices.get(4);
            System.out.println("You have purchased " + Merchandise.CHERRIES + " for " 
                    + format.format(numberItemsSold.get(4) * prices.get(4)));
        }
        if (selectedItem == 6) {
            salesNumbers.add(5, numberItemsSold.get(5) * prices.get(5));
            total += numberItemsSold.get(5) * prices.get(5);
            System.out.println("You have purchased " + Merchandise.CRANBERRIES + " for " 
                    + format.format(numberItemsSold.get(5) * prices.get(5)));
        }
        if (selectedItem == 7) {
            salesNumbers.add(6, numberItemsSold.get(6) * prices.get(6));
            total += numberItemsSold.get(6) * prices.get(6);
            System.out.println("You have purchased " + Merchandise.LEMONS + " for " 
                    + format.format(numberItemsSold.get(6) * prices.get(6)));
        }
        if (selectedItem == 8) {
            salesNumbers.add(7, numberItemsSold.get(7) * prices.get(7));
            total += numberItemsSold.get(7) * prices.get(7);
            System.out.println("You have purchased " + Merchandise.ORANGES + " for " 
                    + format.format(numberItemsSold.get(7) * prices.get(7)));
        }
        if (selectedItem == 9) {
            salesNumbers.add(8, numberItemsSold.get(8) * prices.get(8));
            total += numberItemsSold.get(8) * prices.get(8);
            System.out.println("You have purchased " + Merchandise.RASPBERRIES + " for " 
                    + format.format(numberItemsSold.get(8) * prices.get(8)));
        }
        if (selectedItem == 10) {
            salesNumbers.add(9, numberItemsSold.get(9) * prices.get(9));
            total += numberItemsSold.get(9) * prices.get(9);
            System.out.println("You have purchased " + Merchandise.STRAWBERRIES + " for " 
                    + format.format(numberItemsSold.get(9) * prices.get(9)));
        }
        return total;
    }

    /**
     * A method for calculating the discount cost of the selected items.
     * @param prices contains the prices of the items
     * @param numberOfItemsSold contains the number of items sold;
     * @param total contains the total cost of all the items.
     * @return the total discounted cost of the selected items.
     */
    @Override
    public double itemDiscount(ArrayList<Double> prices, ArrayList<Integer> numberOfItemsSold, double total) {
        for (Integer item : numberItemsSold) {
            if (numberItemsSold.get(item) % 2 == 0) {
                bulkQuantity = numberItemsSold.get(item);
                bulkDiscount = bulkQuantity * BULK_QUANTITY_DISCOUNT;
                totalDiscountSale = bulkDiscount + total * TOTAL_DISCOUNT_PERCENT;
            } else if (numberItemsSold.get(item) % 2 != 0) {
                totalDiscountSale = total * TOTAL_DISCOUNT_PERCENT;
            }
        }
        return totalDiscountSale;
    }

    /**
     * A method for displaying the receipt for the items purchased.
     * @param fruit contains the string value of all the items.
     * @param prices contains the prices of all the items.
     * @param salesNumbers contains the cost of the amount of each item selected.
     * @param totalDiscountSales contain the total minus the discount.
     */
    @Override
    public void displaySales(ArrayList<String> fruit, ArrayList<Double> prices, ArrayList<Double> salesNumbers, double totalDiscountSales) {
        System.out.println("\n\nProduct\t\t\tNumber Sold\t  Cost\t\tTotal");
        System.out.println("-------------------------------------------------------------");
        for (int index = 0; index < fruit.size(); index++) {
            System.out.println(fruit.get(index) + "\t\t   " + numberItemsSold.get(index) + 
                "\t\t" +format.format(prices.get(index)) + "\t\t" + format.format(salesNumbers.get(index)));
        }
        totalDiscountSale = totalDiscountSale / (BULK_QUANTITY_DISCOUNT + TOTAL_DISCOUNT_PERCENT);
        System.out.println("\n\t\t\t\tTotal Discount = " + format.format(totalDiscountSale));
        System.out.println("\t\t\t\tTotal Cost = " + format.format(total));
    }
    
}
