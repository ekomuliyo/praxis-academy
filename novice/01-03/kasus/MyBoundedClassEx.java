public class MyBoundedClassEx{
    public static void main(String[] args) {
        
        // membuat object sub class C dan memberikan nya
        // ke klas BoundEx sebagai type parameter
        BoundEx<C> bec = new BoundEx<C>(new C());
        bec.doRunTest();

        BoundEx<B> beb = new BoundEx<B>(new B());
        beb.doRunTest();

        BoundEx<A> bea = new BoundEx<A>(new A());
        bea.doRunTest();
    }
}

class BoundEx<T extends A>{
    private T objReff;
    
    public BoundEx(T obj){
        this.objReff = obj;
    }

    public void doRunTest(){
        this.objReff.printClass();
        this.objReff.printLagi();;
    }
}

class A{
    public void printClass(){
        System.out.println("I'm in super class A");
    }

    public void printLagi(){
        System.out.println("Print lagi di class A");
    }
}

class B extends A{
    public void printClass(){
        System.out.println("I'm sub class B from class A");
    }

    public void printLagi(){
        System.out.println("Print lagi di class B");
    }
}

class C extends A{
    public void printClass(){
        System.out.println("I'm sub class C from class A");
    }

    public void printLagi(){
        System.out.println("Print lagi di class C");
    }
}