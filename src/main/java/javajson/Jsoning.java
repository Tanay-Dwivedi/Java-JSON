package javajson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Jsoning {
    public static void main(String[] args) {

        try {
            // Create an ObjectMapper to read and write JSON
            ObjectMapper objectMapper = new ObjectMapper();

            // Read existing data from the file as a List<Person>
            List<Person> existingPeople;

            // Specify the file path for the JSON data
            File file = new File("target/personData.json");

            // Check if the file is not empty
            if (file.exists() && file.length() > 0) {
                existingPeople = objectMapper.readValue(file, new TypeReference<List<Person>>() {
                });
            } else {
                // If the file is empty or doesn't exist, initialize an empty list
                existingPeople = new ArrayList<>();
            }

            // Create new data to add
            Person newPerson = new Person(
                    "Tanay",
                    "new.person@example.com",
                    "25",
                    "1998-01-01",
                    "+9876543210",
                    "Canada",
                    new String[]{"English", "French"}
            );

            // Add only the new data to the existing data
            existingPeople.add(newPerson);

            // Write the updated data back to the same file
            objectMapper.writeValue(file, existingPeople);
        } catch (final Exception e) {
            // Handle exceptions, such as JSON parsing or file I/O errors
            System.out.println(e.getMessage());
        }
    }
}
