package javajson;

public class Person {

    private String name;
    private String age;
    private String email;
    private String date_of_birth;
    private String phone_number;
    private String country;
    private String[] languages;

    public Person() {
        super();
    }

    public Person(String name, String age, String email, String date_of_birth, String phone_number, String country, String[] languages) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
        this.country = country;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getCountry() {
        return country;
    }

    public String[] getLanguages() {
        return languages;
    }


}