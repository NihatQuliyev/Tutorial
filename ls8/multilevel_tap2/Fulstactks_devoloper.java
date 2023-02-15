package multilevel_tap2;
public class Fulstactks_devoloper extends Backend_developer {
    String frontend_language;

    public Fulstactks_devoloper(String name, String age, String backend_language, String frontend_language) {
        super(name, age, backend_language);
        this.frontend_language = frontend_language;
    }

    @Override
    public String toString() {
        return "Fulstactks_devoloper{" +
                "frontend_language='" + frontend_language + '\'' +
                ", Backend_language='" + Backend_language + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
