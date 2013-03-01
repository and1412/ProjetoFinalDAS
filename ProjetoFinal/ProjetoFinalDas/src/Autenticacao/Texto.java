package autenticacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Texto extends Autenticacao {

    private File txt;
    private FileReader txtLeitor;
    private FileWriter txtEscritor;
    private BufferedReader bffLeitor;
    private BufferedWriter bffEscritor;
    private FileInputStream arquivo;
    private FileOutputStream dir;
    private Texto estancia;


public Texto()
{
   
        try {
                txt=new File("c:\\temp\\txt.txt");
                if (txt.exists()==false)
              {
                   txt.createNewFile();
                    //Prepara arquivo para Leitura
                      txtLeitor=new FileReader(txt);
                      bffLeitor=new BufferedReader(txtLeitor);
                      
                    //Prepara arquivo para Escrita
                      txtEscritor=new FileWriter(txt,true);
                      bffEscritor=new BufferedWriter(txtEscritor);
                      
                                      
              }else{
                    //Prepara arquivo para Leitura
                      txtLeitor=new FileReader(txt);
                      bffLeitor=new BufferedReader(txtLeitor);
                      
                    //Prepara arquivo para Escrita
                      txtEscritor=new FileWriter(txt,true);
                      bffEscritor=new BufferedWriter(txtEscritor);
                       
                                            
                    }   
            }   catch (FileNotFoundException ex) 
                {
                    Logger.getLogger(Texto.class.getName()).log(Level.SEVERE, null, ex);
                }
                 catch (IOException ex)
                 {
                    Logger.getLogger(Texto.class.getName()).log(Level.SEVERE, null, ex);
                 }
            
}
	
	public boolean autenticar(String nome, String senha)
	{	
            
            if(exite(nome, senha)) return true;else return false;
            
	}

	
	public boolean cadastrar(String nome, String senha)
	{
		try
                {   
                   if(exite(nome, senha)==false) 
                   {  
                        String linha=nome+senha;
                        System.out.println(linha);
                        bffEscritor.write(linha);
                        bffEscritor.newLine();
                        bffEscritor.flush();
                        
                        return true;
                   }
                }catch(IOException ex)
                {
                    ex.printStackTrace();
                }
		
		 return false;
	}

	
	public boolean alterar(String nome, String senha, String novoNome,
			String novaSenha) 
	{
		//Implementando de maneira trivial o codigo deu merda
                         
                        return true;
               
	}

	
	public boolean excluir(String nome, String senha) 
	{
		// Deu merda
		 return false;
	}
        //Verifica se o usuário existe no cadastro 
        public boolean exite(String nome, String senha)
        {
        try 
        {
            FileReader fileReader= new FileReader(txt);
            BufferedReader bffReader=new BufferedReader(txtLeitor);
            String linha=null;
            while((linha=bffReader.readLine())!=null)
            {
                if(linha.equals(nome+senha))return true;
            }
            bffReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(Texto.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex)
        {
            ex.printStackTrace();
             Logger.getLogger(Texto.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            return false;
        }

}
