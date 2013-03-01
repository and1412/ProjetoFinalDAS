/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticacao;

/**
 *
 * @author Ramon
 */
public abstract class Autenticacao 
{
    
    
    
    
        public abstract boolean autenticar(String nome, String senha);
	public abstract boolean cadastrar(String nome, String senha);
	public abstract boolean alterar(String nome, String senha, String novoNome,String novaSenha);
	public abstract boolean excluir(String nome, String senha);
        
        public static Autenticacao obterAutenticacao(int op)
        {
            Autenticacao retorno=null;
            
           switch(op)
           {
               case 1: retorno= new Xml();break;
               case 2: retorno= new Texto();break;
                   
           }
           return retorno;
            
            
            
        }

}
