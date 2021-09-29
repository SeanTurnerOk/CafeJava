import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class CafeUtilTest{
    public static void main(String[] args){
        CafeUtil tester=new CafeUtil();
        System.out.println(tester.getStreakGoal());
        System.out.println(tester.getStreakGoal(3));
        tester.printPriceChart("figs",4.00,5);
        double[] lineItems={3.5,1.5,4.0,4.5};
        System.out.println(tester.getOrderTotal(lineItems));
        List<String> loadMenu=Arrays.asList("drip coffee","cappucino","latte","mocha");
        List<Double> loadPrices=Arrays.asList(1.5,3.5,4.5,3.5);
        ArrayList<String> menu=new ArrayList<String>();
        ArrayList<Double> prices= new ArrayList<Double>();
        menu.addAll(loadMenu);
        prices.addAll(loadPrices);
        tester.displayMenu(menu, prices);
        System.out.println("Add Customer Test");
        ArrayList<String> customers=new ArrayList<String>();
        for(int i=0; i<4;i++){
            tester.addCustomer(customers);
            System.out.println(customers);
        }
    }
}