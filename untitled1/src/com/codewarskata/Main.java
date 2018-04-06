
public class Main {


public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                System.out.println("Invalid operation");
        }

        return 0;
    }
}
    public static void main(String[] args) {
	// write your code here
    }
}
