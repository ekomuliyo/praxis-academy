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
* @author  Zara Ali
* @version 1.0
* @since   2014-03-31
*/

@Retention(RetentionPolicy.RUNTIME)
public @interface Anotation{
    String name() default "Andi";
    int count() default 19;
    String[] tags() default {"Hai", "Hai Juga"};
    
     /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param numA This is the first paramter to addNum method
   * @param numB  This is the second parameter to addNum method
   * @return int This returns sum of numA and numB.
   */
}