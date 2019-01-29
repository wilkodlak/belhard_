package lessonJan25ex3;
/*
 * 3. ������� xml-����, �������� ���������� �� �������� ���������� ������� ����. 
 * ��� ��������� ����������� xml-����� ���������� ����������� ��������������� xsd �����.
3.1. ����� ����������:
- ������� � ����������� ����
- ������� � ���������� ��������
- ����������� ������������� ��������� � ���� ID
- ������� ��������� �� ���������
3.2. ���������� �������� XML-��������� � ������� XSD.
3.3. ���������� �������:
������������ �������������:
- Name - �������� ��������������
- Origin - ������ ������������
- Price - ���� (0 - n USD)
- Type (������ ���� ���������) - ������������ ���� ���, ����������������� (����), 
������� ������( ���� ��� ���), ������ ������������� (���������� �����-������,
��������������), ����� (COM, USB, LPT)
- Critical - �������� �� ������� �������������� ��� ������ ����������.
�������� ������� ������� Devices 
 */
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class LessonJan25ex03 {
	 public static void main(String[] args) {
	        try {
	            // ��������� ����������� ���������
	            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	            // ��������� ������ DOM ��������� �� �����
	            Document document = documentBuilder.parse("devices.xml");
	 
	            // �������� ����� ��� ���������� ����� �����
	            addNewDevice(document);
	 
	        } catch (ParserConfigurationException ex) {
	            ex.printStackTrace(System.out);
	        } catch (SAXException ex) {
	            ex.printStackTrace(System.out);
	        } catch (IOException ex) {
	            ex.printStackTrace(System.out);
	        }
	    }
	 
	    // ������� ���������� ������ �������������� � ������ ���������� � ����
	    private static void addNewDevice(Document document) throws TransformerFactoryConfigurationError, DOMException {
	        // �������� �������� �������
	        Node root = document.getDocumentElement();
	 
	        // ������� ����� ���������� �� ���������
	        Element device = document.createElement("Device");
	        Element name = document.createElement("Name");
	        name.setTextContent("Motherboard");
	        Element origin = document.createElement("Origin");
	        origin.setTextContent("China");
	        // <Date>
	        Element price = document.createElement("Price");
	        price.setTextContent("499");
	        // ������������� �������
	        price.setAttribute("currency", "USD");
	        Element critical=document.createElement("Critical");
	        critical.setTextContent("true");
	        Element type=document.createElement("Type");
	        type.setTextContent("");
	        Element inside=document.createElement("Inside");
	        inside.setTextContent("true");
	        Element electricity=document.createElement("Electrisity");
	        electricity.setTextContent("20");
	        // ������������� �������
	        electricity.setAttribute("used", "Vatt");
	        Element cooler=document.createElement("Cooler");
	        cooler.setTextContent("true");
	        
	        // ��������� ���������� �������� 
	        device.appendChild(name);
	        device.appendChild(origin);
	        device.appendChild(price);
	        device.appendChild(critical);
	        device.appendChild(type);
	        type.appendChild(inside);
	        type.appendChild(electricity);
	        type.appendChild(cooler);
	        
	        // ��������� � �������� �������
	        root.appendChild(device);
	        
	        // ���������� XML � ����
	        writeDocument(document);

/*	        name.setTextContent("Processor");
	        origin.setTextContent("China");
	        price.setTextContent("199");
	        // ������������� �������
	        price.setAttribute("currency", "USD");
	        critical.setTextContent("true");
	        type.setTextContent("");
	        inside.setTextContent("true");
	        electricity.setTextContent("10");
	        cooler.setTextContent("true");
	        
	        // ��������� � �������� �������
	        root.appendChild(device);
	        // ���������� XML � ����
	        writeDocument(document);
*/
	    }
	 
	    // ������� ��� ���������� DOM � ����
	    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
	        try {
	            Transformer tr = TransformerFactory.newInstance().newTransformer();
	            DOMSource source = new DOMSource(document);
	            FileOutputStream fos = new FileOutputStream("devices.xml");
	            StreamResult result = new StreamResult(fos);
	            tr.transform(source, result);
	        } catch (TransformerException | IOException e) {
	            e.printStackTrace(System.out);
	        }
	    }
	

}
