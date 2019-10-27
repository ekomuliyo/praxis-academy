public class MyBoundedInterface{
    public static void main(String[] args) {
        
        // membuat object dari implementasi class X memanggil Y
        // dan memberikannya pada class BoundExmp sebagai type paramenter
        BoundExmp<Y> bey = new BoundExmp<Y>(new Y());
        bey.doRunTest();

        BoundExmp<Z> bez = new BoundExmp<Z>(new Z());
        bez.doRunTest();
    }
}

class BoundExmp<T extends X>{
    private T objectReff;

    public BoundExmp(T objcParam){
        this.objectReff = objcParam;
    }

    public void doRunTest(){
        this.objectReff.printClass();
    }
}

interface X{
    public void printClass();
}

class Y implements X{
    public void printClass(){
        System.out.println("Im in class Y");
    }
}

class Z implements X{
    public void printClass(){
        System.out.println("Im in class Z");
    }
}