package operators;

public class Add implements Operator {
    /**
     * Function to add all numbers to one
     *
     * @param start the base number
     * @param nrs   all the numbers which will be used to calculate the result
     * @return the sum of all given numbers
     */
    @Override
    public double calculate(double start, double... nrs) {
        for (double d : nrs)
            start += d;

        return start;
    }

    /**
     * Function to get the operator
     *
     * @return +
     */
    @Override
    public char getOperator() {
        return '+';
    }
}
