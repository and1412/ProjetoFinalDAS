/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import autenticacao.Autenticacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramon
 */
public class TesteEstancia 
{
   @Test
   public void testaXml()
   {
       Autenticacao xml = null;
       xml=xml.obterAutenticacao(1);
      assertTrue( xml.cadastrar("Ramon", "psy"));
      assertTrue(xml.cadastrar("Andre", "Dedinho"));
      assertTrue(xml.autenticar("Ramon", "psy"));
      assertTrue(xml.alterar("Andre", "Dedinho","andre","VoceMachucouMeuDedinho"));
      assertTrue(xml.excluir("Ramon", "psy"));
      
   }
   @Test
   public void testaTxt()
   {
       Autenticacao txt=null;
       txt=txt.obterAutenticacao(2);
       
       assertTrue(txt.cadastrar("Ramon", "psy"));
       assertTrue(txt.autenticar("Ramon", "psy"));
       
       
   }
   
}
