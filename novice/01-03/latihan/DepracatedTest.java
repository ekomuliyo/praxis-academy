public class DepracatedTest{
    
    @Deprecated
    public void Display(){
        System.out.println("Depracatedtest display()");
    }

    public static void main(String[] args) {
        DepracatedTest dp = new DepracatedTest();
        dp.Display();
    }
}