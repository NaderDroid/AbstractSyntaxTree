import org.apache.tools.ant.taskdefs.Echo

class AST {
    static void main(String[] args) {

        def persons = [
                new Person(firstName: "Tamara" , lastName: "Sud" , age: 23),
                new Person(firstName: "Yuri" , lastName: "Ueno" , age: 30),
                new Person(firstName: "Nader" , lastName: "Halulu" , age:  50),
                new Person(firstName: "Alejandra" , lastName: "Rivera" , age:  28)
        ]


        // The exception is handled magically

        try {
            println(persons[1].getName().toLong())
        }
        catch (Exception e){
            println(e.message)
        }
    }
}