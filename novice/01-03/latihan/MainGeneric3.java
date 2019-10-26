import java.util.ArrayList;

public class MainGeneric3{
    public static void main(String[] args) {
        
        // tidak mendefinisikan type array sehingga object yang dimasukan bisa type apa saja
        ArrayList array = new ArrayList();

        array.add("Ini string 1");
        array.add("ini string 2");
        array.add(19);

        String string1 = (String)array.get(0);
        String string2 = (String)array.get(1);
        Integer integer = (Integer)array.get(2);

        System.out.println(string1 + " " + string2 + " " + integer);

        // mendifinisikan type array
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("String 1");
        arrayList.add("String 2");

        String string3 = (String)arrayList.get(0);
        String string4 = (String)arrayList.get(1);

        System.out.println(string3 + " " + string4);

    }
}