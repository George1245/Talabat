package talabat;
import java.util.Scanner;
import java.util.ArrayList;
public class Talabat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customers= new ArrayList<Customer>();
        ArrayList<RestaurantOwner> owners = new ArrayList<RestaurantOwner>();
        RestaurantOwner o = new RestaurantOwner("Kerolos","12345","KFC");
        owners.add(o);
        Meal m1 = new Meal("Cake",120,60,15,70);
        Meal m2 = new Meal("Mina",120,60,15,70);
        o.mealList.add(m1);
        o.mealList.add(m2);
        Customer c1 = new Customer("Batool","fds","fdsfsd","15");
        customers.add(c1);
        c1.browse(owners);
        c1.show();
        System.out.println("Enter name to edit: ");
        String name = input.next();
        System.out.println("Enter new name: ");
        String newName = input.next();
        o.editMeal(newName, name);
        c1.browse(owners);
    }
}