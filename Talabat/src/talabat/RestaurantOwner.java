package talabat;
import java.util.*;
public class RestaurantOwner extends User{
    Scanner input = new Scanner(System.in);
    String restuarantName;
    ArrayList<Meal> mealList = new ArrayList<Meal>();
    ArrayList<History> history = new ArrayList<History>();
    
    public RestaurantOwner(String username,String password,String restuarantname) {
        super(username,password);
        restuarantName = restuarantname;
    }
    
    public void addMeal() {
        System.out.println("Enter Details For Your New Meal");
        String name;
        System.out.print("Name: ");
        name = input.next();
        double price,calories,time;
        int quantity;
        System.out.print("Price: ");
        price = input.nextDouble();
        System.out.print("Calories: ");
        calories = input.nextDouble();
        System.out.print("Time: ");
        time = input.nextDouble();
        System.out.print("Quantity: ");
        quantity = input.nextInt();
        Meal m = new Meal(name,price,calories,time,quantity);
        mealList.add(m);
    }
    
//    public void editMeal () {
//        String name;
//        System.out.print("Please Enter a Meal Name To Edit: ");
//        name = input.next();
//        boolean found = false;
//        for (int i=0;i<this.mealList.size();i++) {
//            if (this.mealList.get(i).Name.equals(name)) {
//                found = true;
//                System.out.println("Press 1 To Change the Meal Name");
//                System.out.println("Press 2 To Change the Meal Price");
//                System.out.println("Press 3 To Change the Meal Calories");
//                System.out.println("Press 4 To Change the Meal Time");
//                System.out.println("Press 5 To Change the Meal Quantity");
//                int x;
//                System.out.print("Enter Number of Your Choice: ");
//                x = input.nextInt();
//                Meal m;
//                switch(x) {
//                    case 1:
//                    {
//                        String newName;
//                        System.out.print("Enter Your New Meal Name: ");
//                        newName = input.next();
//                        this.mealList.get(i).Name = newName;
//                        break;
//                    }
//                    case 2:
//                    {
//                        double price;
//                        System.out.print("Enter Your New Meal Price: ");
//                        price = input.nextDouble();
//                        this.mealList.get(i).Price = price;
//                        break;
//                    }
//                    case 3:
//                    {
//                        double Calories;
//                        System.out.print("Enter Your New Meal Calories: ");
//                        Calories = input.nextDouble();
//                        this.mealList.get(i).Calories = Calories;
//                        break;
//                    }
//                    case 4:
//                    {
//                        double time;
//                        System.out.print("Enter Your New Meal Time: ");
//                        time = input.nextDouble();
//                        this.mealList.get(i).Time = time;
//                        break;
//                    }
//                    case 5:
//                    {
//                        int quantity;
//                        System.out.print("Enter Your New Meal Quantity: ");
//                        quantity = input.nextInt();
//                        this.mealList.get(i).Quantity = quantity;
//                        break;
//                    }
//                    default: 
//                    {
//                        System.out.println("Invalid Choice");
//                    }
//                }
//            }
//        }
//        if (found == false) {
//            System.out.println("This Meal Not Found");
//        }
//    }
//    
    public void editMeal(String newName,String name) {
        Boolean found = false;
        for (int i = 0; i<this.mealList.size();i++) {
            if (this.mealList.get(i).Name.equals(name)) {
                found = true;
                this.mealList.get(i).Name = newName;
            }
        }
        if (!found) {
            System.out.println("The Meal Not Found");
        }
    }
    public void editMeal(double new1,String name) {
        boolean found = false;
        int x;
        for (int i=0;i<this.mealList.size();i++) {
            if (this.mealList.get(i).Name.equals(name)) {
                found = true;
                x = input.nextInt();
                switch (x)
                {
                    case 1:
                    {
                        this.mealList.get(i).Price = new1;
                        break;
                    }
                    case 2:
                    {
                        this.mealList.get(i).Calories = new1;
                        break;
                    }
                    case 3:
                    {
                        this.mealList.get(i).Time = new1;
                        break;
                    }
                    default :
                    {
                        System.out.println("Invalid Choice");
                    }
                }
            } 
        } if (!found) {
            System.out.println("The Meal Not Found");
        }
    }
    public void editMeal(int q,String name) {
        Boolean found = false;
        for (int i = 0; i<this.mealList.size();i++) {
            if (this.mealList.get(i).Name.equals(name)) {
                found = true;
                this.mealList.get(i).Quantity = q;
            }
        }
        if (!found) {
            System.out.println("The Meal Not Found");
        }
    }
    public void RemoveMeal() {
        String mealName;
        System.out.print("Please Enter The Meal Name to be removed: ");
        mealName = input.next();
        boolean found = false;
        for (int i=0;i<this.mealList.size();i++) {
            if (this.mealList.get(i).Name.equals(mealName)) {
                found = true;
                this.mealList.remove(i);
                System.out.println("The Meal Removed");
            }
        }
        if (found == false) {
            System.out.println("The Meal Not Found");
        }
    }
    
    public void show() {
        for (int i=0; i<this.mealList.size();i++) {
        System.out.printf("Meal %d:\n", i+1);
        System.out.println("Name: " + this.mealList.get(i).Name);
        System.out.println("Price: " + this.mealList.get(i).Price + " $");
        System.out.println("Calories: " + this.mealList.get(i).Calories);
        System.out.println("Time: " + this.mealList.get(i).Time + " Minute");
        System.out.println("Quantity: " + this.mealList.get(i).Quantity);
        System.out.println();
    }
    }
    public void showHistory() {
        for(int i = 0;i<this.history.size();i++)
            this.history.get(i).displayHistory();
    }
}