import org.apache.tools.ant.taskdefs.Echo

class Calculator {

    static int Addition(int a, int b){
        return a + b;
    }

    static int Subtraction(int a, int b){
        return a - b;
    }

    static int Multiplication(int a, int b){
        return a * b;
    }

    static double Division (double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Cant divide by zero");
        }
            double res = (a / b).round(2);
            return res;
    }
}
