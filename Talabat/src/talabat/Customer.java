package talabat;
import java.util.*;
public class Customer extends User{
    Scanner input  = new Scanner(System.in);
    String mobileNumber;
    String Address;
    ArrayList<History> Order = new ArrayList<History>();
    double totalPrice = 0;
    
    public Customer(String username,String password, String phone,String address) {
        super(username,password);
        mobileNumber = phone;
        Address = address;
    }
    public void browse_resturant(RestaurantOwner x) {
          x.show();
          while(true) {
            String name;
            System.out.print("if you want to make order enter the name of meal or -1\n");
            name = input.next();
            boolean found = false;
            for (int i=0;i<x.mealList.size();i++) {
                if (x.mealList.get(i).Name.equals(name)) {
                    found  = true;
                    int quantity;
                    System.out.print("Enter The Quantity: ");
                    quantity = input.nextInt();
                    if (quantity < 0 || x.mealList.get(i).Quantity < quantity) {
                        System.out.println("The Quantity is not available");
                    } else {
                        double TotalPrice = quantity*x.mealList.get(i).Price;
                        this.totalPrice+=TotalPrice;
                        System.out.println("The Total Price is " + TotalPrice + " to confirm order enter 1 :'(");
                        int conf = input.nextInt();
                        if (conf==1) {
                            x.mealList.get(i).Quantity-=quantity;
                            System.out.println("The Order Is Done");
                            String d = java.time.LocalDate.now().toString() + " " + java.time.LocalTime.now().toString();
                            History date = new History(d,name,quantity);
                            x.history.add(date);
                            History order = new History(d,name,quantity);
                            this.Order.add(order);
                        } else {
                            System.out.println("Thanks For Using Our System");
                            return ;
                        }
                    }
                }
            }
            if (found == false) {
                System.out.println("The Meal Not Found");
            }
            System.out.println("to make another order enter 1 else enter any number ");
            int des = input.nextInt();
            if(des!=1)
                break ;
          }
    }
    
    public void browse(ArrayList<RestaurantOwner> arr) {
        for (int i =0;i<arr.size();i++) {
            System.out.printf("The Resturant %d Name : %s\n",i+1,arr.get(i).restuarantName);
        }
        while(true) {
        int x ;
        System.out.print("to enter to any resturant enter the resturant number or -1 to end process \n");
        x = input.nextInt();
        if(x==-1) {
            System.out.println("thanks for using our system \n");
            return ;
        }
        else if (x>0&&x<= arr.size()) {
            browse_resturant(arr.get(x-1));
        }
        else {
            System.out.println("Invalid Choice");
        }
        }
    }
    public void show() {
        for (int i=0;i<this.Order.size();i++) {
            System.out.printf("Order %d: %s\n",i+1,this.Order.get(i).Name);
            System.out.printf("Order Date: %s\n",this.Order.get(i).date);
            System.out.printf("Order Quantity: %d\n",this.Order.get(i).Quantity);
            if(i == Order.size()-1) {
                System.out.print("the total price is "+ totalPrice + "\n");
            }
        }
    }
}