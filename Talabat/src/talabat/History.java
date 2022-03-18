package talabat;
public class History {
    String date;
    String Name;
    int Quantity;
    
    public History (String d,String name,int quantity) {
        date = d;
        Name = name;
        Quantity = quantity;
    }
    
    public void displayHistory() {
        System.out.println("Date: " + date);
        System.out.println("Name: " + Name);
        System.out.println("Quantity: " + Quantity);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }
    
}