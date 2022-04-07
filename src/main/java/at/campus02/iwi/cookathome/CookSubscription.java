package at.campus02.iwi.cookathome;

public class CookSubscription {
    public String firstBox(int age, boolean vegan, boolean veggie, int activePerweek) {
        String erg = "";
        if (vegan) {
            erg = "Vegan";
        } else if (veggie) {
            erg = "Veggie";
        } else if (age <= 60 && activePerweek >= 4) {
            erg = "Fish";
        } else if (age <= 20 || age > 60) {
            erg = "Veggie";
        } else {
            erg = "Vegan";
        }
        return erg;
    }

    public double[] suggestPrice(String box, int age) {
        double[] erg = new double[2];
        if (box.equals("Fish")) {
            if (age <= 25) {
                erg[0] = 39.90;
            } else {
                erg[0] = 49.90;
            }
            erg[1] = 80;
        }
        if (box.equals(("Veggie"))) {
            if (age <= 25 || age > 60) {
                erg[0] = 19.90;
            } else {
                erg[0] = 29.90;
            }
            erg[1] = 42;
        }

        if (box.equals(("Vegan"))) {
            erg[0] = 15;
            if (age < 30) {
                erg[1] = 45;
            } else
                erg[1] = 49.90;
        }
        return erg;
    }
}