package ternary;

public class Ternary {
    public int state;
    public boolean state1;
    public int showMessage(){
        int x =state> 0 ? 4 : 5;
        int y=state1 ? 8 :3;
        return x;
    }
}
