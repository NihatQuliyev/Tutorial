package comparate10;

public class Comparator implements java.util.Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge()>o2.getAge()) {
            return 1;
        }
        else if (o1.getAge()==o2.getAge()){
            return 0;
        }
        else {
            return -1;
        }

    }

    @Override
    public java.util.Comparator<User> reversed() {
        return java.util.Comparator.super.reversed();
    }
}
