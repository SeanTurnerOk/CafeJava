import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CafeUtil{
    public static void main(String[] args){
    }
    public int getStreakGoal(){
        int num=0;
        for(int i=1; i<11;i++){
            num+=i;
        }
        return num;
    }
    public int getStreakGoal(int numWeeks){
        int num=0;
        for(int i=1;i<=numWeeks;i++){
            num+=i;
        }
        return num;
    }
    public void printPriceChart(String name,double price, int num){
        System.out.println(name);
        for(int i=1;i<=num;i++){
            System.out.format("%d - $%.2f%n", i, price*i);
        }
    }
    public double getOrderTotal(double[] item){
        double total=0;
        for(int i=0;i<item.length;i++){
            total+=item[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> names,ArrayList<Double> prices){
        System.out.println("Display Menu Test");
        for(int i=0;i<names.size();i++){
            System.out.println(i+" "+names.get(i)+" -- "+prices.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("What is your name?");
        String customerName = System.console().readLine();
        customers.add(customerName);
        System.out.format("Hello, %s, there are %d customers in front of you",customerName,customers.size()-1);

    }
}
