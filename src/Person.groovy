import groovy.transform.ToString

@ToString
class Person {
    String firstName;
    String lastName;
    int age;
  //  String fullName = lastName + ", "+ firstName;

    Person(){

    }

    Person(String firstName , String lastName , int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    void setAge(int age) {
        this.age = age
    }

}
