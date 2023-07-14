package personaldata;

public class PrincipalPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        person.identification="1094891706";
        person.name="jasbleidy";
        person.pounds= 54;
        person.age= 17;
        person.email= "karenlopezruiz@gmail.com";
        System.out.println(person.showData());

        person1.identification="41962882";
        person1.name="jennifer";
        person1.pounds= 67;
        person1.age=38;
        person1.email="ruizhurtado1307@hotmail.com";
        System.out.println(person1.showData());
    }
}
