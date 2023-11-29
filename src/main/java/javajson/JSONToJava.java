package javajson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class JSONToJava {
    public static void main(String[] args) {

        String filePath = "target/data.json";
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Read the JSON array into a List<Person>
            List<Person> personList = objectMapper.readValue(new File(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));

            // Check if there is at least one person in the list
            if (!personList.isEmpty()) {
                // Get the details of the second person (index 1)
                Person secondPerson = personList.get(1);

                // Print the details of the second person
                System.out.println("Details of the second person: " + secondPerson);
            } else {
                System.out.println("The list is empty.");
            }

        } catch (final Exception e) {
            // Handle exceptions, such as JSON parsing or file I/O errors
            System.out.println(e.getMessage());
        }
    }
}
