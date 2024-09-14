import javax.swing.JLabel;
import java.util.HashMap;

public class CowMilkController {
    private static HashMap<String, Cow> cowDatabase = new HashMap<>();

    static {
        cowDatabase.put("10000001", new Cow("10000001", "white", 1, 2));
        cowDatabase.put("10000002", new Cow("10000002", "white", 3, 4));
        cowDatabase.put("10000003", new Cow("10000003", "white", 5, 6));
        cowDatabase.put("10000067", new Cow("10000067", "white", 7, 8));
        cowDatabase.put("10000066", new Cow("10000066", "white", 9, 10));

        cowDatabase.put("20000001", new Cow("20000001", "brown", 2, 1));
        cowDatabase.put("20000002", new Cow("20000002", "brown", 4, 3));
        cowDatabase.put("20000003", new Cow("20000003", "brown", 6, 5));
        cowDatabase.put("20000297", new Cow("20000297", "brown", 8, 7));
        cowDatabase.put("20000007", new Cow("20000007", "brown", 0, 9));

        cowDatabase.put("30000001", new Cow("30000001", "pink", 1, 2));
        cowDatabase.put("30000003", new Cow("30000003", "pink", 2, 4));
        cowDatabase.put("30000005", new Cow("30000005", "pink", 4, 8));
        cowDatabase.put("30000007", new Cow("30000007", "pink", 8, 4));
        cowDatabase.put("30000009", new Cow("30000009", "pink", 6, 0));

    }

    public static void handleCowId(String cowId, JLabel resultLabel) {
        Cow cow = cowDatabase.get(cowId);
        if (cow != null) {
            double milk = MilkCalculator.calculateMilk(cow);
            resultLabel.setText("     Get Milk " + milk + " Drink.");
        } else {
            resultLabel.setText("     MoooOoOoOOoooOOOOoooo.");
        }
    }
}
