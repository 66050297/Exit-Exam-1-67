public class MilkCalculator {

    public static double calculateMilk(Cow cow) {
        String color = cow.getColor();
        int Years = cow.getAgeYears();
        int Months = cow.getAgeMonths();
        int totalAgeInMonths = cow.getTotalAgeInMonths();
        
        double milkProduced = 0;

        switch (color.toLowerCase()) {
            case "white":
                milkProduced = calWhite(totalAgeInMonths);
                break;
            case "brown":
                milkProduced = calBrown(Years);
                break;
            case "pink":
                milkProduced = calPink(Months);
                break;
        }

        if (milkProduced < 0) {
            milkProduced = 0;
        }
        return milkProduced;
    }

    private static double calWhite(int totalAgeInMonths) {
        
        return 120 - totalAgeInMonths;
    }

    private static double calBrown(int Years) {
        return 40 - Years;
    }

    private static double calPink(int Months) {
        return 30 - Months;
    }
}
