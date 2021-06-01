package memory;

public class Number implements Memorizable {
    private double value;

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
