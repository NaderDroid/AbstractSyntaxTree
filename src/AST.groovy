class AST {
    static void main(String[] args) {
//        Person person = new Person()
//        person.firstName = "Nader"
//        person.lastName = "Althubaity"
//        person.setAge(50)
//        println(person.getName())

        Person person = new Person("Nader" , "Althubaity" , 19);
        Person person1 = new Person("Nader1" , "Althubaity1" , 191);
        Person person3 = new Person("Yuri" , "Althubaity1" , 123);


        Closure personToString = { println(person.toString()) }
        Closure dynamicPersonToString = { Person person2 -> println(person2.toString()) }


//        personToString();
//        dynamicPersonToString(person1);

        handler(dynamicPersonToString , person)

        //Print user full name without toString method
        //This is good in the case that users can avoid using ToString for any reason
        //Also extra liability for using user defined methods

        Closure printFullName = { Person person2 -> println(person2.firstName
        +" " + person2.lastName)}
        Person person2;
        handler(printFullName , person2)
    }

    static void handler(Closure closure , Person person) throws NullPointerException{
        try {
            closure(person)
        }
        catch (NullPointerException e){
            println("("+e.getMessage() + ")\n Make sure Person instance is defined")
        }
    }
}