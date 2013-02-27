/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import autenticacao.Xml;

/**
 *
 * @author Ramon
 */
public class XmlClassTest {
    
    public XmlClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
         
    }
    Xml xml=new Xml();
    
    @Test
    public void testaCadastro()
    {
        xml.cadastrar("ramon","123");
        xml.cadastrar("Yuri", "123");
        xml.cadastrar("Andre", "Dedinho");
    }
    
}
