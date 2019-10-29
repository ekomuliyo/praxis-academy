package MachineATM;

public class Withdraw extends App{
    
    static double withdraw = 0;

    public void setWithdraw(double w){
        withdraw = w;
    }

    public static double getWithdraw(){
        return withdraw;
    }
}