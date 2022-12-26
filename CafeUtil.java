import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal(){
        int total=0;
        for(int i=0;i<=10;i++){
            total+=i;
        }
        return total;
    }
    public double getOrderTotal(double[] prices){
    // declare array and 
    // initialize it with values
    double[] lineItems = {3.5, 1.5, 4.0, 4.5};
    // initialize sum variable with 0
    int sum = 0;
    // add array elements
    for (int i=0; i<lineItems.length; i++) {
      sum += lineItems[i]; // sum = sum + array[i];
    }
    return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i<menuItems.size();i++){
            System.out.println(i + ":" + menuItems.get(i));
        }

    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello,"+ userName);
        System.out.println("There are"+ customers.size()+ "people infront of you");
        customers.add(userName);
        System.out.println(customers);



    }


}