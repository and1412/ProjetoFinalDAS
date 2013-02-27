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
	public abstract void cadastrar(String nome, String senha);
	public abstract void alterar(String nome, String senha, String novoNome,String novaSenha);
	public abstract void excluir(String nome, String senha);

}
