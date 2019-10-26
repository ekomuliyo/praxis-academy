
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

  
@SuppressWarnings("unchecked")
public class AnotationExample{
    public static void main(String[] args) {
        doIt();
    }

    @Anotation()
    public static void doIt(){
        try {
            AnotationExample anotationExample = new AnotationExample();
            Class c = anotationExample.getClass();
            Method method = c.getMethod("doIt");

            Anotation anotation = method.getAnnotation(Anotation.class);
            System.out.println(anotation.name() + " " + anotation.count() + " " + anotation.tags()[0]);
        } catch (NoSuchMethodException e) {
            Logger.getLogger(AnotationExample.class.getName()).log(Level.SEVERE, null, e);
        } catch(SecurityException e){
            Logger.getLogger(AnotationExample.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}