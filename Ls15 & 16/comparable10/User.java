package comparable10;

public class User implements Comparable<User>{
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(User o) {
        if (this.age>o.age) {
            return 1;
        }
            else if (this.age == o.age){
                return 0;
            }
            else {
                return -1;
        }

        //return this.name.compareTo(o.name);
    }
}
