import java.util.Scanner;

public class Array {
    public int max(int a,int b ,int c)
    {
        int[] ededler = {a,b,c};
        int eded = 0;
        for (int i = 0; i <ededler.length ; i++) {
            for (int j = 0; j < ededler.length; j++) {
                if(ededler[i]<ededler[j]){
                    eded = ededler[j];
                }
            }
        }
        return eded;
    }

    public int min(int a,int b ,int c)
    {
        int[] ededler = {a,b,c};
        int eded = 0;
        for (int i = 0; i <ededler.length ; i++) {
            for (int j = 0; j < ededler.length; j++) {
                if(ededler[i]>ededler[j]){
                    eded = ededler[j];
                }
            }
        }
        return eded;
    }

    public int element(int index)
    {
        int[] array = {1,15,3,4,5,6};
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            if(index == i)
            {
                element = array[i];

            }

        }
        return  element;
    }

    public int index(int elemen)
    {
        int[] array = {1,15,15,4,5,6};
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            if(elemen == array[i])
            {
                element = i;
            }

        }
        return  element;
    }


    public String removed(int index) {
        int[] array = {1, 15, 3, 4, 5, 6};
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (i != index)
            str += array[i] + " ";

        }

        return str;
    }
    ///tap 10


    public String axarisContains() {
        System.out.print("str : ");
        String str = new Scanner(System.in).nextLine();
        String newstr = "";
        String[] users = {"Abbas", "Leman", "Xedice", "Ilyas", "Nurlan", "Nihat", "Elchin", "Murad", "Mirhesen", "Emin", "Farid", "Terane"};
        for (int i = 0; i < users.length; i++) {
            if (users[i].contains(str)) {
                newstr += users[i] + " - indexi: " + i + "\n" ;
            }

        }

        if (newstr.isEmpty()) {
            System.out.print("yoxdu");
        }
        return newstr;
    }
    }
