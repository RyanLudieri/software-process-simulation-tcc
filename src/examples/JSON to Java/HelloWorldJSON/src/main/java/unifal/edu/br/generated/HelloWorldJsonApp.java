package unifal.edu.br.generated;

import com.fasterxml.jackson.databind.ObjectMapper;
public class HelloWorldJsonApp {
    // Create a Hello object
    public static void main(String[] args) throws Exception {
        // Create a Hello object
        Hello hello = new Hello();
        hello.setLanguage("English");
        hello.setMessage("Hello, World!");

        // Serialize: Convert Java object to JSON
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hello);
        System.out.println("Serialized JSON:");
        System.out.println(jsonString);

        // Deserialize: Convert JSON back to Java object
        String inputJson = "{\"language\":\"English\", \"message\":\"Hello, World!\"}";
        Hello deserializedHello = mapper.readValue(inputJson, Hello.class);

        System.out.println("\nDeserialized JSON:");
        System.out.println("Language: " + deserializedHello.getLanguage());
        System.out.println("Message: " + deserializedHello.getMessage());
    }
}
