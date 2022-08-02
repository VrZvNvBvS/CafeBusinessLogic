import java.util.ArrayList;

public class CafeUtil {

    // sums together every consecutive integer from 1 to 10 
    // and returns the sum
    public int getStreakGoal(){
        int total = 0;
        for(int i = 1; i <=10; i++){
            total += i;
        }
        return total;
    }

    // Sum all of the prices in the array 
      // and return the total
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for(int i = 0; i <prices.length; i++){
            total += prices[i];
        }
        return total;
    }


    // Given an ArrayList of menu items (strings), 
        // print out each index and menu item.
    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i <menuItems.size();i++){
            System.out.println(i +" "+ menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Enter your Name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello , %s", userName));
        System.out.println(String.format("There is %s person ahead you!", customers.size()));

    }

}
