public class MySimpleTwoGenerics{
    public static void main(String[] args) {
        SimpleGen<String, Integer> sample
                    = new SimpleGen<String, Integer>("Java2Novice", 123);
        sample.printType();
    }
}

class SimpleGen<U, V>{

    private U objUReff;
    private V objVReff;

    public SimpleGen(U objU, V objV){
        this.objUReff = objU;
        this.objVReff = objV;
    }

    public void printType(){
        System.out.println("U type: "+ this.objUReff.getClass().getName());
        System.out.println("V type: "+ this.objVReff.getClass().getName());
    }
}