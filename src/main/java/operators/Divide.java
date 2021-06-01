package operators;

public class Divide implements Operator {

    /**
     * Function to divide the start number with all numbers given
     *
     * @param start the base number
     * @param nrs   all the numbers which will be used to calculate the result
     * @return the result of this division
     */
    @Override
    public double calculate(double start, double... nrs) {
        for (double d : nrs) start /= d;
        return start;
    }

    /**
     * Function to get the operator
     *
     * @return /
     */
    @Override
    public char getOperator() {
        return '/';
    }
}
