package operators;

public class Subtract implements Operator {
    /**
     * Function to subtract all numbers from the start number
     *
     * @param start the base number
     * @param nrs   all the numbers which will be used to calculate the result
     * @return the result of the subtraction
     */
    @Override
    public double calculate(double start, double... nrs) {
        for (double d : nrs) start -= d;
        return start;
    }

    @Override
    public char getOperator() {
        return '-';
    }
}
