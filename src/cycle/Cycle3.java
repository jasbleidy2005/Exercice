package cycle;

public class Cycle3 {
    public int stars;
    public int ends;
    public void showCycle(){
        do{
            System.out.println(stars);
            stars++;
        }while(stars <= ends);
    }
}
