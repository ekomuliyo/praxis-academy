public class Base{
    public static void main(String[] args) {
        Base t = new Derived();
        t.Display();
    }

    public void Display(){
        System.out.println("Base display()");
    }

}

class Derived extends Base{
    @Override
    public void Display(){
        System.out.println("Derived display()");
    }
}