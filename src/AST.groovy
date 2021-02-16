class AST {
    static void main(String[] args) {
//        Person person = new Person()
//        person.firstName = "Nader"
//        person.lastName = "Althubaity"
//        person.setAge(50)
//        println(person.getName())

        Person person = new Person();
        Person person1 = new Person("Nader" , "Althubaity" , 19);

        println(person1.toString())
    }
}