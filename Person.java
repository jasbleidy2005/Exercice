package personaldata;

public class Person {
    public String identification;
    public String name;
    public String email;
    public int age;
    public float pounds;
    public String showData(){
        return "the identification of the person is "+ identification+"the name is "+name;
    }
}
