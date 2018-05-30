import Data.Father;
import Domain.Persona;
import java.io.IOException;
import org.jdom.JDOMException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo
 */
public class TestTarea {
    
    public TestTarea() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void hello() throws JDOMException, IOException {
         Father father = new Father("./data/my_people.xml");
         Persona persona1 = new Persona("Steven", "Morales", "Rosales", "15/1/1998","Costa Rica", 123, 456);
         father.insertPerson(persona1);
         Persona persona2 = new Persona("Allan", "Solano", "Solano", "21/10/1998","Costa Rica", 789, 123);
         father.insertPerson(persona2);
         Persona persona3 = new Persona("Ricardo", "Chinchilla", "Gonzalez", "7/5/1999", "USA", 458, 789);
         father.insertPerson(persona3);
     }
}
