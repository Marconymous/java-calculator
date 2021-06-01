package memory;

import operators.Operator;

public class Memory implements Memorizable {
    private Operator operator;
    private Memorizable[] value = new Memorizable[2];

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setMemorizable(int index, Memorizable m) {
        if (index > value.length - 1 || index < 0) return;
        value[index] = m;
    }

    @Override
    public double getValue() {
        double[] out = new double[2];
        for (int i = 0; i < out.length; i++) {
            Memorizable m = value[i];
            out[i] = m.getValue();
        }

        return operator.calculate(out[0], out[1]);
    }
}
