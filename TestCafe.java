import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args){

        CafeUtil coffee = new CafeUtil();
        // Declare, Instantatiate, Initialize instance of OBJ
        
        // Object member variables
        int order = coffee.getStreakGoal();
        double[] prices = {6.75,12.99,8,7};
        double total = coffee.getOrderTotal(prices);
        // System.out.println(total);

        ArrayList<String> menu= new ArrayList<String>();
        menu.add("Drip Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");


        coffee.displayMenu(menu);

        ArrayList<String> customers= new ArrayList<String>();
        customers.add("first customer: ");
        coffee.addCustomer(customers);
    }
}