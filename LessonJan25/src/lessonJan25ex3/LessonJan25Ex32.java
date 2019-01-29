package lessonJan25ex3;


import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;
 
public class LessonJan25Ex32 {
     
    /**
     * @param pathXml - путь к XML
     * @param pathXsd - путь к XSD
     */
    public static boolean checkXMLforXSD(String pathXml, String pathXsd)
            throws Exception {
 
        try {
            File xml = new File(pathXml);
            File xsd = new File(pathXsd);
             
            if (!xml.exists()) {
                System.out.println("Не найден XML " + pathXml);
            }
             
            if (!xsd.exists()) {
                System.out.println("Не найден XSD " + pathXsd);
            }
             
            if (!xml.exists() || !xsd.exists()) {
                return false;
            }
 
            SchemaFactory factory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(pathXsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(pathXml));
            return true;
        } catch (SAXException e) {
            System.out.println(e.getMessage());
            return false;
        }
 
    }
 
    public static void main(String[] args) throws Exception {
        boolean b = LessonJan25Ex32.checkXMLforXSD("C:\\x1.xml", "C:\\x1.xsd");
        System.out.println("XML соответствует XSD : " + b);
 
    }

}


