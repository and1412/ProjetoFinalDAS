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
    
   
    
   
    
    
    @Test
    public void testaCadastro()
    {
        Xml xml=new Xml();
        assertFalse(xml.cadastrar("Nayane","123"));
        assertFalse(xml.cadastrar("Renan","123"));
       
        
    }
    @Test 
    public void testAutenticacao()
    {
        Xml xml=new Xml();
        assertTrue(xml.autenticar("Nayane", "123"));
    }
    @Test 
    public void testeExcluir()
    {
        Xml xml=new Xml();
        assertTrue(xml.excluir("Ramon", "123"));
    }
    @Test
    public void testeAlterar()
    {
        Xml xml=new Xml();
        assertTrue(xml.alterar("Nayane", "123","Nayane Cruz","1234"));
    }
    
}
