package switch1;

import java.util.Scanner;

public class PrincipalSwitch {
    public static void main(String[] args) {
        Switch1 switch1 =new Switch1();
        Scanner reader = new Scanner(System.in);
        System.out.println("enter an option:");
        switch1.option=reader.nextInt();
        System.out.println(switch1.showOption());
    }
}
