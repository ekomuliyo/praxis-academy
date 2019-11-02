/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package FunctionJava;

import fj.F;
import fj.data.Array;
import fj.data.List;
import fj.data.Option;
import static fj.data.Array.array;

import static fj.data.List.list;
import static fj.data.List.fromString;
import static fj.data.Option.none;
import static fj.data.Option.some;
import static fj.function.Characters.isLowerCase;
import static fj.Show.arrayShow;
import static fj.Show.intShow;
import static fj.Show.optionShow;
import static fj.function.Integers.even;
import static fj.function.Integers.add;


public class App {

    public static void main(String[] args) {
        
        // Array Exists, mencari string huruf kecil semua
        // final Array<String> a = array("Hello", "There", "what", "DAY", "iS", "iT");
        // final boolean b = a.exists(s -> fromString(s).forall(isLowerCase));
        // System.out.println(b);// akan mengembalikan nilai true karena terdapat string "what"

        // Array For all, mengembalikan nilai true apabila semua element array huruf kecil
        // mengembalikan nilai false apabila salah satu saja element array huruf besar
        // final Array<String> a = array("hello", "there", "what", "day", "is", "it");
        // final boolean b = a.forall(s -> fromString(s).forall(isLowerCase));
        // System.out.println(b);

        // Array Filter, yaitu menfilter sebuah array dengan kondisi dimana array bernilai genap yaitu menggunakan, bilangan modulus 2 == 0
        // final Array<Integer> a = array(97, 44, 67, 3, 22, 90, 1, 77, 98, 1078, 6, 64, 6, 79, 42);
        // final Array<Integer> b = a.filter(even);
        // final Array<Integer> c = a.filter(i -> i % 2 == 0);
        // arrayShow(intShow).println(b);

        // Array Fold Left, tambah/kurang/bagi/kali setiap bilangan dalam array dari kiri sampai akhir
        // final Array<Integer> a = array(97, 44, 67, 3, 22, 90, 1, 77, 98, 1078, 6, 64, 6, 79, 42);
        // final int b = a.foldLeft(add, 0);
        // F<Integer, F<Integer, Integer>> add2 = i -> (j -> i + j); // ini tanpa memakai library
        // final int c = a.foldLeft(add2, 0);
        // System.out.println(b);
        // System.out.println(c);

        // Array Map, tambah/kurang/bagi/kali atau sama dengan, setiap element array
        // final Array<Integer> a = array(1,2,3);
        // final Array<Integer> b = a.map(add.f(40));
        // final Array<Integer> c = a.map(i -> i + 30);
        // arrayShow(intShow).println(b);
        // arrayShow(intShow).println(c);

        // List Map, tambah/kurang/bagi/kali atau sama dengan, setiap element list
        // final List<Integer> a = list(1,2,3);
        // final List<Integer> b = a.map(add.f(22));
        // final List<Integer> c = a.map(i -> i = 4);
        // System.out.println(b);
        // System.out.println(c);

        // Option Bind, yaitu kondisi mencocokan suatu nilai, dengan menggunan ternary if
        // final Option<Integer> o1 = some(7);
        // final Option<Integer> o2 = some(8);
        // final Option<Integer> o3 = none();
        // F<Integer, Option<Integer>> f = i -> i % 2 == 0 ? some(i * 3) : none();
        // final Option<Integer> bind1 = o1.bind(f);
        // final Option<Integer> bind2 = o2.bind(f);
        // final Option<Integer> bind3 = o3.bind(f);

        // optionShow(intShow).println(bind1); // none karena o4 bilangan ganjil
        // optionShow(intShow).println(bind2); // 8 dikalikan 3 = 24
        // optionShow(intShow).println(bind3); // none
    
        // Option filter, yaitu menfilter suatu nilai jika kondisi terpenuhi maka akan bernilai true
        // final Option<Integer> o1 = some(7);
        // final Option<Integer> o2 = none();
        // final Option<Integer> o3 = some(8);
        // final Option<Integer> filter1 = o1.filter(even);
        // final Option<Integer> filter2 = o2.filter(even);
        // final Option<Integer> filter3 = o3.filter(even);
        // F<Integer, Boolean> f = i -> i % 2 == 0;
        // final Option<Integer> filter4 = o1.filter(f);
        // final Option<Integer> filter5 = o2.filter(f);
        // final Option<Integer> filter6 = o3.filter(i -> i % 2 == 0);
        // optionShow(intShow).println(filter4);
        // optionShow(intShow).println(filter5);
        // optionShow(intShow).println(filter6);

        // Option Map, tambah/kurang/kali/bagi atau sama dengan dari nilai integer tertentu
        final Option<Integer> o1 = some(7);
        final Option<Integer> o2 = none();
        final Option<Integer> p1 = o1.map(add.f(40));
        final Option<Integer> p2 = o2.map(add.f(41));

        final Option<Integer> p3 = o1.map(i -> i + 42);
        final Option<Integer> p4 = o2.map(i -> i + 40);

        optionShow(intShow).println(p1);
        optionShow(intShow).println(p2);

    }
}