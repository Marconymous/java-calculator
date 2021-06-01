import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        new CalculatorDemo().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean isInteger;
        String math = null;
        do {
            System.out.print("Enter a math problem -> ");
            String problem = sc.nextLine();
            isInteger = Calculator.verifyIntegrity(problem);
            if (isInteger) math = problem;
        } while (!isInteger);

        calculator.setMathProblem(math);
        double res = calculator.calculate();
        System.out.println(res);
    }
}
