package garbacge_tap7;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nihat", "19");
        Student student2 = new Student("Elchin", "19");
        Student student3 = new Student("Murad", "19");
        Student student4 = new Student("Emin", "19");
        Student student5 = new Student("Nurlan", "19");
        {
            student3 = student4 = null;

            System.gc();
            System.runFinalization();
        }

        student5.showID();
    }
}
