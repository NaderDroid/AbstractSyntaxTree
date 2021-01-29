class AST {
    static void main(String[] args) {
//        Person person = new Person()
//        person.firstName = "Nader"
//        person.lastName = "Althubaity"
//        person.setAge(50)
//        println(person.getName())

        def persons = [
                new Person(firstName: "Tamara" , lastName: "Sud" , age: 23),
                new Person(firstName: "Yuri" , lastName: "Ueno" , age: 30),
                new Person(firstName: "Nader" , lastName: "Halulu" , age:  50),
                new Person(firstName: "Alejandra" , lastName: "Rivera" , age:  28)
        ]

        //Iterate over persons array

        for (Person p : persons){
//            printf("Full name is %s " , p.getName())
            if (p.getAge() > 20 && p.getAge() < 40){
                println(" Full name is: " + p.getName()
                        +" You are "+ p.getAge() +" and you are young ")
            }
            else {
                println(" Full name is: " + p.getName()
                        + " your age is " + p.getAge() + ":((")
            }
        }
    }
}