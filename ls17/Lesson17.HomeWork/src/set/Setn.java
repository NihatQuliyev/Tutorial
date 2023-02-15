package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setn {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // obyektler hash kimi yerlesir
        Set<Integer> set1 = new LinkedHashSet<>(); // obyekler daxil elediyimiz ardiciliqda yerlesir
        Set<String> set3 = new TreeSet<>(); // obyektler sirayla yerlesir (reqemdise kicikden boyuye ,elifba sirasiyla yazir )
        set3.add("Nihat"); //elave etme metodu
        set3.add("Anar");
        set3.remove("Anar"); // obyekte gore silir
        set3.contains("Elchin");
        set3.clear(); // listi tam silir
        set3.isEmpty(); //bos ilub olmadigin yoxlayir

        Object[] integers = set3.toArray(); // Listi araya cevirir

        System.out.println(integers[0]);
        //Qeyd: bezi metodlar listle eyni oldugu ucun tekrar yazmadim


    }

}
