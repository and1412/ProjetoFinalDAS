package autenticacao;

import java.util.ArrayList;
/*
 * Estratégia ... 
 * devo gerar uma Um array list de contatos 
 * e salvar um xml com esses contatos 
 * depois deve haver a possibilidade de 
 * alterar  e bla bla bla 
 * preciso de um metodo para recuperar e salvar o 
 * arquivo no diretorio 
 * 
 */
import com.thoughtworks.xstream.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Xml extends Autenticacao{

       
        private ArrayList <Pessoa> usuarios;
	String lixo;
        private XStream xml;
        

        public Xml()
        {
           xml=new XStream();
     
           usuarios= new ArrayList<Pessoa>();
           usuarios=recuperaLista();
            
        }
        
	public boolean autenticar(String nome, String senha)
	{
		ArrayList <Pessoa> lista=this.recuperaLista();
                
                for(Pessoa usuario : lista)
                {
                    if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha))
                    return true;
                }
		return false;
	}
    
   
   /*
    * Colocar uma pre condição
    */
	public void cadastrar(String nome, String senha)
	{
               // ArrayList<Pessoa> usuarios=new ArrayList<Pessoa>();
                
		Pessoa pessoa= new Pessoa(nome, senha);
                usuarios.add(pessoa);
                salvaLista(usuarios);
              
	}
	public void alterar(String nome, String senha, String novoNome,
			String novaSenha) 
	{
		lixo=nome;
		lixo=senha;
		 
	}

	
	public void excluir(String nome, String senha) 
	{
		lixo=nome;
		lixo=senha;
		 
	}
        
        
public ArrayList <Pessoa> recuperaLista()
        {
            
            ArrayList <Pessoa> lista=null;
        try {
            lista=(ArrayList)this.xml.fromXML(new FileInputStream("c:\\Temp\\xml.xml"));
       
            } catch (FileNotFoundException ex) 
            {
                ex.printStackTrace();
                Logger.getLogger(Xml.class.getName()).log(Level.SEVERE, null, ex);
            }
            return lista;
        }
        
        public void salvaLista(ArrayList <Pessoa> usuarios)
        {
        try {
           
            xml.toXML(usuarios, new FileOutputStream("c:\\Temp\\xml.xml"));
        } catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
            Logger.getLogger(Xml.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
	
}
