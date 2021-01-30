import org.apache.tools.ant.taskdefs.Echo

class AST {
    static void main(String[] args) {

        Calculator calculator = new Calculator()

        println(calculator.Addition(10 , 12));
        println(calculator.Subtraction(10 , 12));
        println(calculator.Multiplication(10 , 12));
        println(calculator.Division(10 , 12));
        println(calculator.Division(7 , 3));
//        println(calculator.Division(10 , 0));


        try {
            println(calculator.Division(10 , 0));
        }
        catch (Exception e) {
            println(e.message)
        }
    }
}