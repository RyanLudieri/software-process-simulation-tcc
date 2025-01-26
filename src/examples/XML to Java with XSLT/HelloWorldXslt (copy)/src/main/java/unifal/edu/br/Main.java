package unifal.edu.br;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Caminhos dos arquivos XML e XSLT
            File xmlFile = new File("src/examples/XML to Java with XSLT/HelloWorldXslt (copy)/src/main/resources/hello.xml");
            File xsltFile = new File("src/examples/XML to Java with XSLT/HelloWorldXslt (copy)/src/main/resources/transform.xsl");
            File outputFile = new File("src/examples/XML to Java with XSLT/HelloWorldXslt (copy)/src/main/java/unifal/edu/br/hello.java");


            // Configurar fontes para XML e XSLT
            StreamSource xmlSource = new StreamSource(xmlFile);
            StreamSource xsltSource = new StreamSource(xsltFile);

            // Configurar transformador
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xsltSource);

            // Realizar a transformação
            StreamResult outputResult = new StreamResult(outputFile);
            transformer.transform(xmlSource, outputResult);

            System.out.println("Transformação concluída! Código Java gerado em: " + outputFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
