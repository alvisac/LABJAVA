package Lab9;

public class Rock {
    private int num;
    protected String description;
    private double weight;

    public Rock(int num, double weight) {
        this.num = num;
        this.description = "Unclassified";
        this.weight = weight;
    }

    public int getNum() {
        return num;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

}
