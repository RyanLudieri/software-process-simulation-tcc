package unifal.edu.br;

import javax.xml.bind.*;
import java.io.*;

public class HelloWorldApp {
    public static void main(String[] args) throws Exception {
        // Criar objeto Greeting
        Greeting greeting = new Greeting();
        greeting.setLanguage("English");
        greeting.setContent("Hello, World!");

        // Marshal: Converter objeto Java em XML
        JAXBContext context = JAXBContext.newInstance(Greeting.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        System.out.println("Marshalling to XML:");
        marshaller.marshal(greeting, System.out);

        // Unmarshal: Converter XML em objeto Java
        String xmlInput = "<greeting language=\"English\">Hello, World!</greeting>";
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Greeting unmarshalledGreeting = (Greeting) unmarshaller.unmarshal(new StringReader(xmlInput));
        System.out.println("\nUnmarshalling from XML:");
        System.out.println("Language: " + unmarshalledGreeting.getLanguage());
        System.out.println("Value: " + unmarshalledGreeting.getContent());
    }
}

