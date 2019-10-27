public class MySimpleGenerics{
    public static void main(String[] args) {
        // membuat object SimpleGenerics dengan parameter String
        SimpleGenerics<String> sgs = new SimpleGenerics<String>("Java2Novice");
        sgs.printType();

        // membuat object SimpleGenerics dengan paramenter boolean
        SimpleGenerics<Boolean> sgb = new SimpleGenerics<Boolean>(Boolean.TRUE);
        sgb.printType();
    }
}

class SimpleGenerics<T>{

    // mendeklarasikan object dengan Type T
    private T objReff = null;

    // membuat konstruktor untuk mengambil type T
    public SimpleGenerics(T param){
        this.objReff = param;
    }

    public T getObjReff(){
        return this.objReff;
    }

    public void printType(){
        System.out.println("Type: "+objReff.getClass().getName());
    }
}