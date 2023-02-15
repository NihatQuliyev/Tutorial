package list;

import java.util.ArrayList;
import java.util.List;

public class List1   {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List<Integer> list = new ArrayList();


        list.add(1);
        list.add(1);
        list.add(0,4);//verilen indexe daxil edirik
        list.add(4);
        list.add(3);
        list.add(2);
        list.set(3,10);//verileni indexe daxil edir hemin indexdeki obyekti silir
        list.remove(0); //indexe gore silir
        list.remove(new Integer(3)); //obyekti silir
        list.get(3); // daxil edilen obyekti bize qaytarir
        list.clear();  //listi temiz silir
        list.hashCode(); //hash kodun gosterir listin
        list.size(); // listin uzunlugunu qaytarir
        list.indexOf(1);// obyektin indexini qaytarir
        list.isEmpty(); //bos olub olmamasini yoxlayir
        list.contains(1); // element varsa truuyoxdusa false qaytarir
        list.equals(list1);
        System.out.println(list);

    }

}
