package operators;

public interface Operator {
    /**
     * Function to calculate a result with the given parameters
     *
     * @param start the base number
     * @param nrs   all the numbers which will be used to calculate the result
     * @return the result
     */
    double calculate(double start, double... nrs);

    /**
     * Function to get the operator
     *
     * @return the operator
     */
    char getOperator();
}
