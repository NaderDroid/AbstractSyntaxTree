import org.apache.tools.ant.taskdefs.Echo

class AST {
    static void main(String[] args) {

        def persons = [
                new Person(firstName: "Tamara" , lastName: "Sud" , age: 23),
                new Person(firstName: "Yuri" , lastName: "Ueno" , age: 30),
                new Person(firstName: "Nader" , lastName: "Halulu" , age:  50),
                new Person(firstName: "Alejandra" , lastName: "Rivera" , age:  28)
        ]


        // The drop methods from the gdk


        //the string is 'Yuri'
        println(persons[1].getFirstName().drop(2)) //expect 'ri'
        println(persons[1].getFirstName().dropRight(2)) //expect 'Yu'
    }

}