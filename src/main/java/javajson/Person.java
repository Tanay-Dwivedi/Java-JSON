package javajson;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {

    private String name;
    private String age;
    private String email;
    private String date_of_birth;
    private String phone_number;
    private String country;
    private String[] languages;

}
