
import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main{
    public static void main(String[] args){
        myMethod();   
    }

    @MyAnotation(value = 10)
    public static void myMethod(){
        Main main = new Main();

        try {
            Method m = main.getClass().getMethod("myMethod");

            MyAnotation anotation = m.getAnnotation(MyAnotation.class);

            System.out.println(anotation.value());
            System.out.println(anotation.nilai());
        } catch (Exception e) {
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnotation{
    int value() default 0;
    String nilai() default "hai";
}