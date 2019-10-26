import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Ini adalah penggunaan custom annotations
 * 
 * @author Eko Muliyo
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation{

    /**
     * ini contoh penggunaan variabel di dalam anotasi dengan interface
     * 
     */
    String Developer() default "Eko";
    String Expirydate();
}

public class Test {

    @TestAnnotation(Developer = "data", Expirydate = "01-01-2020")
    void fun1(){
        System.out.println("Test method 1");
    }

    @TestAnnotation(Developer = "fair", Expirydate = "01-01-2021")
    void fun2(){
        System.out.println("Test method 2");
    }

    public static void main(String[] args){
        System.out.println("Haii");
    }


}