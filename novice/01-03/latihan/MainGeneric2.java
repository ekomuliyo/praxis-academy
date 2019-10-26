public class MainGeneric2{
    public static void main(String[] args){
        genericDisplay("String");
        genericDisplay(100);
    }

    static <U> void genericDisplay(U element){
        System.out.println(element.getClass().getName() + " = " + element);
    }
}