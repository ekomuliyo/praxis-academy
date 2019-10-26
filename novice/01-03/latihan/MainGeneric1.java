public class MainGeneric1{
    public static void main(String[] args){
        TestGeneric<String, Integer> object1 = 
                new TestGeneric<String, Integer>("Ini lagi-lagi string", 123);
        object1.print();

        TestGeneric<Integer, String> object2 = 
                new TestGeneric<Integer, String>(123, "Ini string di akhir");
        object2.print();
    }
}

// parameter T dan U adalah Type Parameter yang akan dimasukan
class TestGeneric<T, U>{
    T object1;
    U object2;
    TestGeneric(T object1, U object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    public void print(){
        System.out.print(object1);
        System.out.print(object2);
        System.out.println();
    }
}