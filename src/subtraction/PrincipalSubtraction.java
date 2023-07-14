package subtraction;

public class PrincipalSubtraction {
    public static void main(String[] args) {
        Subtraction subtraction= new Subtraction();
        //instancia es la creacion del objeto
        subtraction.number1 = 10;
        subtraction.number2 = 9;
        System.out.println("the subtraction is "+ subtraction.subtraction());

    }
}
