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
public class PointOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product = new Product();
        product.salesInput();
        product.itemDiscount(product.getPrices(), product.getNumberSold(), product.getTotal());
        product.displaySales(product.getFruit(), product.getPrices(), product.getSalesNumbers(), product.getTotalDiscountSale());
    }
    
}
