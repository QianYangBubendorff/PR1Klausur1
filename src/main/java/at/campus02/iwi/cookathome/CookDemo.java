package at.campus02.iwi.cookathome;

import java.util.Arrays;

public class CookDemo {
    public static void main(String[] args) {
        CookSubscription s1= new CookSubscription();

        String erg= s1.firstBox(30,false,true,3);
        System.out.println(erg);

        double[] price = s1.suggestPrice("Veggie", 35);
        System.out.println(Arrays.toString(price));
    }
}
