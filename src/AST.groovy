class AST {
    static void main(String[] args) {
        Person person = new Person()
        person.firstName = "Nader"
        person.lastName = "Althubaity"
        person.setAge(50)
        println(person.getName())

        if (person.getAge() > 20 && person.getAge() < 40){
            printf("You are %s and you are young" , person.getAge())
        }
        else {
            printf("your age is %s" , person.getAge())
        }
    }
}
