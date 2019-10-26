import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
* <h1>Add Two Numbers!</h1>
* The AddNum program implements an application that
* simply adds two given integer numbers and Prints
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Eko Muliyo
* @version 1.0
* @since   2019-10-10
*/

/**
  * method ini hanya interface anotasi
*/

@Retention(RetentionPolicy.RUNTIME)
public @interface Anotation{
    String name() default "Andi";
    int count() default 19;
    String[] tags() default {"Hai", "Hai Juga"};
    

}