package lessonJan25ex3;
/*
 * 3. Создать xml-файл, хранящий информацию об объектах предметной области ниже. 
 * Для валидации полученного xml-файла необходимо разработать соответствующую xsd схему.
3.1. Общие требования:
- Простые и комплексные типы
- Шаблоны и предельные значения
- Обязательно использование атрибутов и типа ID
- Задание атрибутов по умолчанию
3.2. Произвести проверку XML-документа с помощью XSD.
3.3. Предметная область:
Компьютерные комплектующие:
- Name - название комплектующего
- Origin - страна производства
- Price - цена (0 - n USD)
- Type (должно быть несколько) - периферийное либо нет, энергопотребление (ватт), 
наличие кулера( есть или нет), группа комплектующих (устройства ввода-вывода,
мультимедийные), порты (COM, USB, LPT)
- Critical - критично ли наличие комплектующего для работы компьютера.
Корневой элемент назвать Devices 
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
	            // Создается построитель документа
	            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	            // Создается дерево DOM документа из файла
	            Document document = documentBuilder.parse("devices.xml");
	 
	            // Вызываем метод для добавления новой книги
	            addNewDevice(document);
	 
	        } catch (ParserConfigurationException ex) {
	            ex.printStackTrace(System.out);
	        } catch (SAXException ex) {
	            ex.printStackTrace(System.out);
	        } catch (IOException ex) {
	            ex.printStackTrace(System.out);
	        }
	    }
	 
	    // Функция добавления нового комплектующего и записи результата в файл
	    private static void addNewDevice(Document document) throws TransformerFactoryConfigurationError, DOMException {
	        // Получаем корневой элемент
	        Node root = document.getDocumentElement();
	 
	        // Создаем новое устройство по элементам
	        Element device = document.createElement("Device");
	        Element name = document.createElement("Name");
	        name.setTextContent("Motherboard");
	        Element origin = document.createElement("Origin");
	        origin.setTextContent("China");
	        // <Date>
	        Element price = document.createElement("Price");
	        price.setTextContent("499");
	        // Устанавливаем атрибут
	        price.setAttribute("currency", "USD");
	        Element critical=document.createElement("Critical");
	        critical.setTextContent("true");
	        Element type=document.createElement("Type");
	        type.setTextContent("");
	        Element inside=document.createElement("Inside");
	        inside.setTextContent("true");
	        Element electricity=document.createElement("Electrisity");
	        electricity.setTextContent("20");
	        // Устанавливаем атрибут
	        electricity.setAttribute("used", "Vatt");
	        Element cooler=document.createElement("Cooler");
	        cooler.setTextContent("true");
	        
	        // Добавляем внутренние элементы 
	        device.appendChild(name);
	        device.appendChild(origin);
	        device.appendChild(price);
	        device.appendChild(critical);
	        device.appendChild(type);
	        type.appendChild(inside);
	        type.appendChild(electricity);
	        type.appendChild(cooler);
	        
	        // Добавляем в корневой элемент
	        root.appendChild(device);
	        
	        // Записываем XML в файл
	        writeDocument(document);

/*	        name.setTextContent("Processor");
	        origin.setTextContent("China");
	        price.setTextContent("199");
	        // Устанавливаем атрибут
	        price.setAttribute("currency", "USD");
	        critical.setTextContent("true");
	        type.setTextContent("");
	        inside.setTextContent("true");
	        electricity.setTextContent("10");
	        cooler.setTextContent("true");
	        
	        // Добавляем в корневой элемент
	        root.appendChild(device);
	        // Записываем XML в файл
	        writeDocument(document);
*/
	    }
	 
	    // Функция для сохранения DOM в файл
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
