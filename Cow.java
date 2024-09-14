public class Cow {
    private String id;
    private String color;
    private int ageYears;
    private int ageMonths;

    public Cow(String id, String color, int ageYears, int ageMonths) {
        this.id = id;
        this.color = color;
        this.ageYears = ageYears;
        this.ageMonths = ageMonths;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public int getAgeMonths() {
        return ageMonths;
    }

    public int getTotalAgeInMonths() {
        return (ageYears * 12) + ageMonths;
    }
}
