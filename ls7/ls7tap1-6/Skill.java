public class Skill {
    String language;
    String programingLanguage;
    String technology;

    public Skill(String language, String programingLanguage, String technology) {
        this.language = language;
        this.programingLanguage = programingLanguage;
        this.technology = technology;

    }

    public String getInfo()
    {
        return  "Language: " + language +"\nprogramingLanguage" +programingLanguage + "\ntechnology" +technology ;


    }
    public String getLanguage(String newLanguage)
    {
        this.language = newLanguage;

        return newLanguage;
    }
    public String programingLanguage(String newProgramingLanguage)
    {
        this.programingLanguage = newProgramingLanguage;

        return newProgramingLanguage;
    }
    public String technology(String newTechnology)
    {
        this.technology = newTechnology;

        return newTechnology;
    }
}
