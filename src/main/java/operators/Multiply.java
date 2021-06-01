package operators;

public class Multiply implements Operator {
    /**
     * Function to multiply all given numbers
     *
     * @param start the base number
     * @param nrs   all the numbers which will be used to calculate the result
     * @return the result of this multiplication
     */
    @Override
    public double calculate(double start, double... nrs) {
        for (double d : nrs) start *= d;
        return start;
    }

    /**
     * The operator
     *
     * @return *
     */
    @Override
    public char getOperator() {
        return '*';
    }
}
