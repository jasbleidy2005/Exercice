package switch1;

public class Switch1 {
    public int option;
    public String showOption(){
        switch (option){
            case 1:{
                return "your prize is a cap";
            }
            case 2:{
                return "your prize is a pencil";
            }
            default:{
                return "incorrect option";
            }
        }
    }
}
