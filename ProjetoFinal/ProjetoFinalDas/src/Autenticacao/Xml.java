package Autenticacao;

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
import java.io.File;
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
        try{
           xml=new XStream();
     
           usuarios= new ArrayList<Pessoa>();
          
           File arquivo1=new File("c:\\temp\\xml.xml");
                      
           if (arquivo1.exists()==false)
           {
                   
                         Pessoa Default=new Pessoa("default", "123");
                         usuarios.add(Default);
                         xml.toXML(usuarios , new FileOutputStream(arquivo1));
                         usuarios=recuperaLista();
                        
           }else  usuarios=recuperaLista();
            }catch (FileNotFoundException ex) 
                            {
                                ex.printStackTrace();
                                Logger.getLogger(Xml.class.getName()).log(Level.SEVERE, null, ex);
                            }
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
     
	public boolean cadastrar(String nome, String senha)
	{
               
            if(existe(nome, senha)==true) return false; 
            else{
                
                    Pessoa pessoa= new Pessoa(nome, senha);
                    usuarios.add(pessoa);
                    salvaLista(usuarios);
                    return true;
                }
	}
	public boolean alterar(String nome, String senha, String novoNome,
			String novaSenha) 
	{
		if(existe(nome, senha)==true)
                {
                    for(Pessoa usuario:usuarios)
                    {
                        if(usuario.getNome().equals(nome)&& usuario.getSenha().equals(senha))
                        {
                            usuario.setNome(novoNome);
                            usuario.setSenha(novaSenha);
                            break;
                        }
                        
                    }
                    salvaLista(usuarios);
                    return true;
                }
		 
                return false;
	}

	
	public boolean excluir(String nome, String senha) 
	{
		if(existe(nome,senha)==true)
                {   
                    for(Pessoa usuario:usuarios)
                    {
                        if(usuario.getNome().equals(nome)&&usuario.getSenha().equals(senha))
                        {
                            usuarios.remove(usuario);
                            break;
                        }
                    }
                    salvaLista(usuarios);
                            return true;
                }
                
                return false;
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
        public boolean existe(String nome, String senha)
        {
            for (Pessoa usuario : usuarios)
            {
              if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha))
                  return true;
            }
            
            return false;
        }
	
}
