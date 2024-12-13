package d16methodCreation_overload;

import java.util.ArrayList;
import java.util.List;

public class KendiCozumum {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(32);
        sayilar.add(14);
        sayilar.add(78);
        sayilar.add(43);
        sayilar.sort(null);
        System.out.println(sayilar); //[14, 32, 43, 65]

        int minFark = sayilar.get(1) - sayilar.get(0);

        for (int i = 1; i < sayilar.size(); i++) {
            minFark = Math.min(minFark, sayilar.get(i) - sayilar.get(i-1));

        }
        System.out.println(minFark);

        for (int i = 1; i < sayilar.size(); i++) {
            if (sayilar.get(i) - sayilar.get(i-1) == minFark){
                System.out.println(sayilar.get(i) + " ve " + sayilar.get(i-1));
            }
        }
    }
}
