
package Data;

import Domain.Persona;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;


public class Father {
    //variables
    private Document document;
    private Element root;
    private String path;

    public Father() {
    }

    public Father(String path) throws JDOMException, IOException {
        this.path = path;
        
        File fileStudent = new File(path);
        if (fileStudent.exists()) {
            //1. El archivo ya existe, entonces lo cargo en memoria
            
            //toma la estructura de datos y las carga en memoria
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);
            
            //cargar en memoria
            this.document=saxBuilder.build(this.path);
            this.root = this.document.getRootElement();
            
        }else{
            //2. El archivo no existe, lo creo y lo guardo
            
            //creo el elemento raiz
            this.root = new Element("people");
            
            //creamos el documento
            this.document = new Document(this.root);
            
            //guardar el archivo en disco duro
            storeXML();
        }
    }
    
    private void storeXML() throws FileNotFoundException, IOException{
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(this.document, new PrintWriter(this.path));
    }
    
    public void deleteFile(){
        File file = new File("./data/my_people.xml");
        file.delete();
    }
    
    //insertar una persona
    public void insertPerson(Persona persona) throws IOException{
        Element todos[] = pplElem();
        boolean contr = false;
        for (int i = 0; i < todos.length; i++) {
            deleteFile();
            Element person = (Element) todos[i];
            if(persona.getCedulaPadre() == Integer.parseInt(person.getAttributeValue("identification"))){
                Element insert = new Element("Person");
                insert.setAttribute("identification", String.valueOf(persona.getCedula()));
                Element eName = new Element("name");
                eName.addContent(persona.getNombre());
                Element eLastName1 = new Element("LastName1");
                eLastName1.addContent(persona.getApellido1());
                Element eLastName2 = new Element("SecondLastName");
                eLastName2.addContent(persona.getApellido2());
                Element eBirthDate = new Element("Birthday");
                eBirthDate.addContent(persona.getFechaDeNacimiento());
                Element eFather = new Element("FatherID");
                eFather.addContent(String.valueOf(persona.getCedulaPadre()));
                Element eCountry = new Element("Country");
                eCountry.addContent(persona.getPais());
                insert.addContent(eName);
                insert.addContent(eLastName1);
                insert.addContent(eLastName2);
                insert.addContent(eBirthDate);
                insert.addContent(eCountry);
                insert.addContent(eFather);
                person.addContent(insert);
                todos[i] = person;
                contr=true;
                storeXML();
            }else{
                java.util.List arr = person.getChildren("Person");
                for (Object object : arr) {
                    Element el = (Element) object;
                    if (persona.getCedulaPadre() == Integer.parseInt(el.getAttributeValue("identification"))) {
                        Element insert = new Element("Person");
                        insert.setAttribute("identification", String.valueOf(persona.getCedula()));
                        Element eName = new Element("name");
                        eName.addContent(persona.getNombre());
                        Element eLastName1 = new Element("LastName1");
                        eLastName1.addContent(persona.getApellido1());
                        Element eLastName2 = new Element("SecondLastName");
                        eLastName2.addContent(persona.getApellido2());
                        Element eBirthDate = new Element("Birthday");
                        eBirthDate.addContent(persona.getFechaDeNacimiento());
                        Element eFather = new Element("FatherID");
                        eFather.addContent(String.valueOf(persona.getCedulaPadre()));
                        Element eCountry = new Element("Country");
                        eCountry.addContent(persona.getPais());
                        insert.addContent(eName);
                        insert.addContent(eLastName1);
                        insert.addContent(eLastName2);
                        insert.addContent(eBirthDate);
                        insert.addContent(eCountry);
                        insert.addContent(eFather);
                        el.addContent(insert);
                        todos[i] = person;
                        contr = true;
                        storeXML();
                    }
                
            }
        }
        }
        if(contr!=true){
            //debemos crear elemento por elemento respect al estudiante
        Element ePerson = new Element("person");
        ePerson.setAttribute("identification", String.valueOf(persona.getCedula()));
        Element eName = new Element("name");
        eName.addContent(persona.getNombre());
        Element eLastName1 = new Element("LastName1");
        eLastName1.addContent(persona.getApellido1());
        Element eLastName2 = new Element("SecondLastName");
        eLastName2.addContent(persona.getApellido2());
        Element eBirthDate = new Element("Birthday");
        eBirthDate.addContent(persona.getFechaDeNacimiento());
        Element eFather = new Element("FatherID");
        eFather.addContent(String.valueOf(persona.getCedulaPadre()));
        Element eCountry = new Element("Country");
        eCountry.addContent(persona.getPais());
        
        ePerson.addContent(eName);
        ePerson.addContent(eLastName1);
        ePerson.addContent(eLastName2);
        ePerson.addContent(eBirthDate);
        ePerson.addContent(eCountry);
        ePerson.addContent(eFather);
        //agregamos al root
        this.root.addContent(ePerson);
        //guardar en disco duro
        storeXML();
        }
        
    }
    
    //leer todos los hijos de la raíz
    public Persona[] getAllPeople(){
        int peopleQuantity = this.root.getContentSize();
        //obtenemos una lista con todos los elementos de root
        java.util.List elementList = this.root.getChildren();
        //definir el tamaño del arreglo
        Persona[] peopleArray = new Persona[peopleQuantity];
        //recorrer la lista para ir insertando en el arreglo
        int count = 0;
        for (Object currentObject: elementList) {
       //     for(int i=0;i<elementList.size();i++){
            //casting de object a element
            Element currentElement = (Element)currentObject;
            //crea estudiante
            Persona currentPerson = new Persona();
            //id
            currentPerson.setCedula(Integer.parseInt(currentElement.getAttributeValue("identification")));
            //name
            currentPerson.setNombre(currentElement.getChild("name").getValue());
            //last name
            currentPerson.setApellido1(currentElement.getChild("LastName1").getValue());
            currentPerson.setApellido2(currentElement.getChild("SecondLastName").getValue());
            currentPerson.setFechaDeNacimiento(currentElement.getChild("Birthday").getValue());
            currentPerson.setCedulaPadre(Integer.parseInt(currentElement.getChild("FatherID").getValue()));
                peopleArray[count++]=currentPerson;
        }
        return peopleArray;
    }
    
    public Element[] pplElem(){
        int quan = this.root.getContentSize();
        Element ppl[] = new Element[quan];
        java.util.List elementList = this.root.getChildren();
        int count=0;
        for(Object currentObj: elementList){
            Element currentElement = (Element) currentObj;
            ppl[count++]=currentElement;
        }
        return ppl;
    }
    
    public void deletePerson(int num) throws IOException{
        java.util.List elementList = this.root.getChildren();
 for(int i=0;i<elementList.size();i++){
        elementList.remove(num);
 }
        storeXML();
    }
        public void deleteFather(Persona person) throws IOException{
        java.util.List elementList = this.root.getChildren();
        elementList.remove(person);
        
        storeXML();
    }
    
}
