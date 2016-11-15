/*
 * Created: 11-15-2016
 * Programmer: Ian James Fannon
 * A program to simulate a point of sale system to calculate the cost 
 * and purchase of a certain amount of products.
 */
package pointofsale;

/**
 * @author Ian James Fannon
 */
public enum Merchandise {
    APPLES("Apples     ", 1.25), BANANAS("Bananas    ", 1.69), BLACKBERRIES("Blackberries", 2.00),
    BLUEBERRIES("Blueberries", 2.69), RASPBERRIES("Raspberries", 2.46), STRAWBERRIES("Strawberries", 3.99),
    CRANBERRIES("Cranberries", 2.50), CHERRIES("Cherries   ", 4.99), ORANGES("Oranges    ", 3.99),
    LEMONS("Lemons     ", 1.75);
    
    private final String description;
    private final double price;
    
    /**
     * A constructor to initialize the variables.
     * @param description to hold the name of each item.
     * @param price to hold the price of each item.
     */
    Merchandise(String description, double price) {
        this.description = description;
        this.price = price;
    }
    
    /**
     * An accessor method to get the value.
     * @return the value of the variable description.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * An accessor method to get the value.
     * @return the value of the variable price.
     */
    public double getPrice() {
        return price;
    }
}
