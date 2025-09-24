package ie.atu.week2;

public class Calculator {
    private int num1;
    private int num2;
    private String operation;
    private double result;

    public Calculator(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = 0;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }

    public void calculateTotal() {
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result  = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) {
                    System.out.println("Error: divide by zero");
                    break;
                } else {
                    result  = num1 / num2;
                    break;
                }
            default:
                System.out.println("Error: unknown operation");
        }
    }
}
