import memory.Memorizable;
import memory.Memory;
import memory.Number;
import operators.*;

import java.util.ArrayList;

public class Calculator {
    private String mathProblem;
    private ArrayList<Operator> ops = new ArrayList<>();

    private static final char[] allowedChars = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '/', '*', '-', '+', '.', '(', ')'
    };

    public Calculator() {
        ops.add(new Add());
        ops.add(new Subtract());
        ops.add(new Multiply());
        ops.add(new Divide());
    }

    public static boolean verifyIntegrity(String problem) {
        for (char c : problem.toCharArray()) {
            boolean isCorrect = false;
            for (char v : allowedChars) {
                if (c == v) {
                    isCorrect = true;
                    break;
                }
            }

            if (!isCorrect) return false;
        }
        return true;
    }

    public String getMathProblem() {
        return mathProblem;
    }

    public void setMathProblem(String mathProblem) {
        this.mathProblem = mathProblem;
    }

    public static char[] getAllowedChars() {
        return allowedChars;
    }

    private Operator getOperatorFromChar(char c) {
        for (Operator o : ops) {
            if (o.getOperator() == c) return o;
        }
        return null;
    }

    public double calculate() {
        int index = 0;
        int totalOperations = 0;
        for (char c : mathProblem.toCharArray()) {
            if (c >= 42 && c <= 47 && c != 46) totalOperations++;
        }


        System.out.println("Total Operations -> " + totalOperations);

        int foundOperations = 0;

        Memory current = new Memory(); // The current operation we are working in
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < mathProblem.toCharArray().length; i++) {
            char c = mathProblem.toCharArray()[i];

            if (c >= 48 && c <= 57 || c == 46) {
                sb.append(c);
                System.out.println("appended " + c + " to sb");
            } else if (c >= 42 && c <= 47) {
                foundOperations++;
                if (index == 1 && foundOperations < totalOperations) {
                    Memorizable temp = current;
                    current = new Memory();
                    current.setMemorizable(0, temp);
                    System.out.println("Swapped to new Memory");
                } else {
                    Number num = new Number();
                    num.setValue(Double.parseDouble(sb.toString()));
                    current.setMemorizable(index, num);
                    index = 1;
                    sb = new StringBuilder();
                    System.out.println("Added Number to memory");
                }
                current.setOperator(getOperatorFromChar(c));
            }
        }
        Number num = new Number();
        num.setValue(Double.parseDouble(sb.toString()));
        current.setMemorizable(index, num);
        return current.getValue();
    }
}
